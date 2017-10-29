package com.trinus.suffragium.manager

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import com.trinus.suffragium.BuildConfig
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Lucas Sales on 29/10/2017.
 */

class AppManagers(vararg params: AppManager) : AppManager {
    private val managers = params.asList()

    override fun init(application: Application) {
        for (m in managers) {
            m.init(application)
        }
    }
}


class LeakCanaryManager @Inject constructor() : AppManager {
    override fun init(application: Application) {
        if (!LeakCanary.isInAnalyzerProcess(application)) {
            LeakCanary.install(application)
        }
    }
}

class TimberManager @Inject constructor() : AppManager {
    override fun init(application: Application) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}