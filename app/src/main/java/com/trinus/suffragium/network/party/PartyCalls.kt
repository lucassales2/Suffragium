package com.trinus.suffragium.network.party

import io.reactivex.Single
import org.json.JSONObject
import retrofit2.http.GET

/**
 * Created by Lucas Sales on 29/10/2017.
 */

interface PartyCalls {

    @GET("partidos")
    fun getPartididos(): Single<JSONObject>
}