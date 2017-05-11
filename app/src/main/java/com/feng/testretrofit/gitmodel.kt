package com.feng.testretrofit

/**
 * 作者: feng on 2017/5/11.
 * 网址:http://www.cnblogs.com/simadi/  https://github.com/simadi
 */

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

class gitmodel {
    var login: String? = null
    var id: Int? = null
    @SerializedName("avatar_url")
    var avatarUrl: String? = null
    @SerializedName("gravatar_id")
    var gravatarId: String? = null
    var url: String? = null
    @SerializedName("html_url")
    var htmlUrl: String? = null
    @SerializedName("followers_url")
    var followersUrl: String? = null
    @SerializedName("following_url")
    var followingUrl: String? = null
    @SerializedName("gists_url")
    var gistsUrl: String? = null
    @SerializedName("starred_url")
    var starredUrl: String? = null
    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null
    @SerializedName("organizations_url")
    var organizationsUrl: String? = null
    @SerializedName("repos_url")
    var reposUrl: String? = null
    @SerializedName("events_url")
    var eventsUrl: String? = null
    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null
    var type: String? = null
    @SerializedName("site_admin")
    var siteAdmin: Boolean? = null
    var name: String? = null
    var company: String? = null
    var blog: String? = null
    var location: String? = null
    var email: String? = null
    var hireable: Boolean? = null
    var bio: Any? = null
    @SerializedName("public_repos")
    var publicRepos: Int? = null
    @SerializedName("public_gists")
    var publicGists: Int? = null
    var followers: Int? = null
    var following: Int? = null
    @SerializedName("created_at")
    var createdAt: String? = null
    @SerializedName("updated_at")
    var updatedAt: Date? = null
}