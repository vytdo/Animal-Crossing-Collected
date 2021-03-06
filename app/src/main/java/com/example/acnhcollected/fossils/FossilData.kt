package com.example.acnhcollected.fossils
import com.google.gson.annotations.SerializedName


data class FossilData(
    @SerializedName("file-name")
    val fileName: String,
    @SerializedName("image_uri")
    val imageUri: String,
    @SerializedName("museum-phrase")
    val museumPhrase: String,
    @SerializedName("name")
    val name: Name,
    @SerializedName("price")
    val price: Int,
    var isSelected : Boolean = false
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