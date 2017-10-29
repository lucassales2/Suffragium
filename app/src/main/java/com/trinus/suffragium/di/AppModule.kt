package com.trinus.suffragium.di

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.trinus.suffragium.SuffragiumApplication
import com.trinus.suffragium.manager.AppManagers
import com.trinus.suffragium.manager.LeakCanaryManager
import com.trinus.suffragium.manager.TimberManager
import com.trinus.suffragium.util.AppRxSchedulers
import dagger.Module
import dagger.Provides
import java.io.File
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by Lucas Sales on 29/10/2017.
 */

@Module
class AppModule {
    @Provides
    fun provideContext(application: SuffragiumApplication): Context {
        return application.applicationContext
    }

    @Singleton
    @Provides
    fun provideRxSchedulers(): AppRxSchedulers {
        return AppRxSchedulers()
    }

    @Named("app")
    @Provides
    @Singleton
    fun provideAppPreferences(application: SuffragiumApplication): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

    @Provides
    @Singleton
    @Named("cache")
    fun provideCacheDir(application: SuffragiumApplication): File {
        return application.cacheDir
    }

    @Provides
    fun provideAppManagers(
            leakCanaryManager: LeakCanaryManager,
            timberManager: TimberManager): AppManagers {
        return AppManagers(leakCanaryManager, timberManager)
    }


}