package com.trinus.suffragium.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.trinus.suffragium.BuildConfig
import com.trinus.suffragium.network.party.PartyCalls
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


/**
 * Created by Lucas Sales on 29/10/2017.
 */

@Module
class NetworkModule {

    private val mBaseUrl = "https://dadosabertos.camara.leg.br/api/v2/"

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            if (BuildConfig.DEBUG) {
                level = HttpLoggingInterceptor.Level.BASIC
            }
        }
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder.addInterceptor {
            val request = it.request()
            it.proceed(request.newBuilder()
                    .addHeader("accept", "application/json").build())
        }
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }


    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build()
    }

    @Provides
    @Singleton
    fun providePartyCalls(retrofit: Retrofit): PartyCalls {
        return retrofit.create(PartyCalls::class.java)
    }

}