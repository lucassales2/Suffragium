package com.trinus.suffragium

import com.trinus.suffragium.di.DaggerAppComponent
import com.trinus.suffragium.manager.AppManagers
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

/**
 * Created by Lucas Sales on 21/10/2017.
 */

class SuffragiumApplication : DaggerApplication() {
    @Inject lateinit var managers: AppManagers

    override fun onCreate() {
        super.onCreate()
        managers.init(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}