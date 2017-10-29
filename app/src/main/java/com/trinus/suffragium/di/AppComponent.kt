package com.trinus.suffragium.di

import com.trinus.suffragium.SuffragiumApplication
import com.trinus.suffragium.network.NetworkModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Lucas Sales on 29/10/2017.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ViewModelBuilder::class,
        NetworkModule::class,
        AppModule::class))
interface AppComponent : AndroidInjector<SuffragiumApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SuffragiumApplication>()

}