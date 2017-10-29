package com.trinus.suffragium.di

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

/**
 * Created by Lucas Sales on 29/10/2017.
 */
@Module
internal abstract class ViewModelBuilder {

    @Binds
    internal abstract fun bindViewModelFactory(factory: SuffragiumViewModelFactory): ViewModelProvider.Factory

}