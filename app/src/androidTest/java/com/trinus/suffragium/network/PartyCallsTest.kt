package com.trinus.suffragium.network

import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.google.gson.Gson
import com.trinus.suffragium.network.party.PartyCalls
import io.reactivex.schedulers.TestScheduler
import okhttp3.OkHttpClient
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

/**
 * Created by Lucas Sales on 29/10/2017.
 */

@RunWith(AndroidJUnit4::class)
class PartyCallsTest {

    @Inject
    lateinit var partyCalls: PartyCalls
    val testScheduler = TestScheduler()
    @Before
    fun start() {
        val builder = OkHttpClient.Builder()
        builder.addInterceptor {
            val request = it.request()
            it.proceed(request.newBuilder()
                    .addHeader("accept", "application/json").build())
        }


        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(Gson()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://dadosabertos.camara.leg.br/api/v2/")
                .client(builder.build())
                .build()

        partyCalls = retrofit.create(PartyCalls::class.java)
    }

    @Test
    fun getPartidosTest() {

        val r = partyCalls.getPartididos()

                .subscribeOn(testScheduler)
                .observeOn(testScheduler)
                .blockingGet()
        assert(r.toString().isNotEmpty())
    }
}