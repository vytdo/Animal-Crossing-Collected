package com.example.acnhcollected.seaCreatures
import com.google.gson.annotations.SerializedName


data class SeaCreatureData(
    @SerializedName("availability")
    val availability: Availability,
    @SerializedName("catch-phrase")
    val catchPhrase: String,
    @SerializedName("file-name")
    val fileName: String,
    @SerializedName("icon_uri")
    val iconUri: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image_uri")
    val imageUri: String,
    @SerializedName("museum-phrase")
    val museumPhrase: String,
    @SerializedName("name")
    val name: Name,
    @SerializedName("price")
    val price: Int,
    @SerializedName("shadow")
    val shadow: String,
    @SerializedName("speed")
    val speed: String
)

data class Availability(
    @SerializedName("isAllDay")
    val isAllDay: Boolean,
    @SerializedName("isAllYear")
    val isAllYear: Boolean,
    @SerializedName("month-array-northern")
    val monthArrayNorthern: List<Int>,
    @SerializedName("month-array-southern")
    val monthArraySouthern: List<Int>,
    @SerializedName("month-northern")
    val monthNorthern: String,
    @SerializedName("month-southern")
    val monthSouthern: String,
    @SerializedName("time")
    val time: String,
    @SerializedName("time-array")
    val timeArray: List<Int>
)

data class Name(
    @SerializedName("name-CNzh")
    val nameCNzh: String,
    @SerializedName("name-EUde")
    val nameEUde: String,
    @SerializedName("name-EUen")
    val nameEUen: String,
    @SerializedName("name-EUes")
    val nameEUes: String,
    @SerializedName("name-EUfr")
    val nameEUfr: String,
    @SerializedName("name-EUit")
    val nameEUit: String,
    @SerializedName("name-EUnl")
    val nameEUnl: String,
    @SerializedName("name-EUru")
    val nameEUru: String,
    @SerializedName("name-JPja")
    val nameJPja: String,
    @SerializedName("name-KRko")
    val nameKRko: String,
    @SerializedName("name-TWzh")
    val nameTWzh: String,
    @SerializedName("name-USen")
    val nameUSen: String,
    @SerializedName("name-USes")
    val nameUSes: String,
    @SerializedName("name-USfr")
    val nameUSfr: String
)