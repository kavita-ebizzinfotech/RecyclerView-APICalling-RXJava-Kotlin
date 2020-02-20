package android.com.rxkotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import android.R.attr.name




class Hero internal constructor(
    name: String, realname: String,
    team: String, firstappearance: String, createdby: String,
    publisher: String, imageurl: String, bio: String
) {

    internal val name: String
    internal val realname: String
    internal val team: String
    internal val firstappearance: String
    internal val createdby: String
    internal val publisher: String
    internal val imageurl: String
    internal val bio: String

    init {
        this.name = name
        this.realname = realname
        this.team = team
        this.firstappearance = firstappearance
        this.createdby = createdby
        this.publisher = publisher
        this.imageurl = imageurl
        this.bio = bio
    }

    fun getName(): String {
        return name
    }

    fun getRealname(): String {
        return realname
    }

    fun getTeam(): String {
        return team
    }

    fun getFirstappearance(): String {
        return firstappearance
    }

    fun getCreatedby(): String {
        return createdby
    }

    fun getPublisher(): String {
        return publisher
    }

    fun getImageurl(): String {
        return imageurl
    }

    fun getBio(): String {
        return bio
    }
}