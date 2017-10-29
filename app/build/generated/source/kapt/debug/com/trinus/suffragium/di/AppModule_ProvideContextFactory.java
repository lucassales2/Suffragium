// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.trinus.suffragium.di;

import android.content.Context;
import com.trinus.suffragium.SuffragiumApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<SuffragiumApplication> applicationProvider;

  public AppModule_ProvideContextFactory(
      AppModule module, Provider<SuffragiumApplication> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(
      AppModule module, Provider<SuffragiumApplication> applicationProvider) {
    return new AppModule_ProvideContextFactory(module, applicationProvider);
  }
}
