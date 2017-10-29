// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.trinus.suffragium.di;

import android.content.SharedPreferences;
import com.trinus.suffragium.SuffragiumApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideAppPreferencesFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<SuffragiumApplication> applicationProvider;

  public AppModule_ProvideAppPreferencesFactory(
      AppModule module, Provider<SuffragiumApplication> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return Preconditions.checkNotNull(
        module.provideAppPreferences(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SharedPreferences> create(
      AppModule module, Provider<SuffragiumApplication> applicationProvider) {
    return new AppModule_ProvideAppPreferencesFactory(module, applicationProvider);
  }
}
