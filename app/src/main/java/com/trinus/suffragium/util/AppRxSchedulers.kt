package com.trinus.suffragium.util

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Lucas Sales on 29/10/2017.
 */

data class AppRxSchedulers(
        val database: Scheduler = Schedulers.single(),
        val disk: Scheduler = Schedulers.io(),
        val network: Scheduler = Schedulers.io(),
        val main: Scheduler = AndroidSchedulers.mainThread())