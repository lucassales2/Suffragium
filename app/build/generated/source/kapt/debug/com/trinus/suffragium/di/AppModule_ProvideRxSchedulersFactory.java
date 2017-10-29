// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.trinus.suffragium.di;

import com.trinus.suffragium.util.AppRxSchedulers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvideRxSchedulersFactory implements Factory<AppRxSchedulers> {
  private final AppModule module;

  public AppModule_ProvideRxSchedulersFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public AppRxSchedulers get() {
    return Preconditions.checkNotNull(
        module.provideRxSchedulers(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AppRxSchedulers> create(AppModule module) {
    return new AppModule_ProvideRxSchedulersFactory(module);
  }
}