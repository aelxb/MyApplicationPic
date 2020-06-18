package com.example.myapplicationpic

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SunsetPhoto(val url: String) : Parcelable {

    companion object {
        fun getSunsetPhotos(): Array<SunsetPhoto> {
            return arrayOf<SunsetPhoto>(SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"),
                SunsetPhoto("https://aws.random.cat/meow"))
        }}}