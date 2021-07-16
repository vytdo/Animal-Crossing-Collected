package com.example.acnhcollected.fossils

import android.os.Bundle
import android.util.Log
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.acnhcollected.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FossilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fossil, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://acnhapi.com/v1a/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(FossilApi::class.java)

        api.fetchAllFossils().enqueue(object : Callback<List<FossilData>>{
            override fun onResponse(call: Call<List<FossilData>>, response: Response<List<FossilData>>) {

                showData(response.body()!!)

            }

            override fun onFailure(call: Call<List<FossilData>>, t: Throwable) {
                d("fossil", "onFailure")
            }

        })

    }

    private fun showData(fossils : List<FossilData>) {
        val recyclerView = view?.findViewById<RecyclerView>(R.id.fossil_recycler_view)
        recyclerView!!.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = FossilAdapter(fossils)
    }

}