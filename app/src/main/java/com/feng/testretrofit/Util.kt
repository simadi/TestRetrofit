package com.feng.testretrofit

import java.lang.reflect.InvocationTargetException

/**
 * 作者: feng on 2017/5/11.
 * 网址:http://www.cnblogs.com/simadi/  https://github.com/simadi
 */

object Util {
    @Throws(NoSuchMethodException::class, IllegalAccessException::class, IllegalArgumentException::class, InvocationTargetException::class)
    fun GetObjectValues(model: Any):String {
        val field = model.javaClass.declaredFields        //获取实体类的所有属性，返回Field数组
        val sb = StringBuilder()
        for (j in field.indices) {     //遍历所有属性

            val type = field[j].genericType.toString()    //获取属性的类型
            var t=type.substring(type.lastIndexOf(".")+1)

            var name = field[j].name    //获取属性的名字
            name = name.substring(0, 1).toUpperCase() + name.substring(1) //将属性的首字符大写，方便构造get，set方法

            val m = model.javaClass.getMethod("get" + name)
            var  v=if (m.invoke(model)==null) "null" else m.invoke(model).toString()

            sb.append(t+" "+name+"=" +v+"\n" )
        }
        return sb.toString()
    }
}
