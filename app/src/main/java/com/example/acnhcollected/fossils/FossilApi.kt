package com.example.acnhcollected.fossils

import retrofit2.Call
import retrofit2.http.GET

interface FossilApi {

    @GET("fossils")
    fun fetchAllFossils() : Call<List<FossilData>>
}