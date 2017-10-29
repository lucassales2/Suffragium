// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.trinus.suffragium.di;

import android.app.Activity;
import android.app.Fragment;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import com.trinus.suffragium.SuffragiumApplication;
import com.trinus.suffragium.SuffragiumApplication_MembersInjector;
import com.trinus.suffragium.manager.LeakCanaryManager;
import com.trinus.suffragium.manager.TimberManager;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.Preconditions;
import java.util.Collections;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private AppModule appModule;

  private DaggerAppComponent(Builder builder) {
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
  }

  @Override
  public void inject(SuffragiumApplication arg0) {
    injectSuffragiumApplication(arg0);
  }

  private SuffragiumApplication injectSuffragiumApplication(SuffragiumApplication instance) {
    DaggerApplication_MembersInjector.injectActivityInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>
                    emptyMap()));
    DaggerApplication_MembersInjector.injectBroadcastReceiverInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends BroadcastReceiver>,
                    Provider<AndroidInjector.Factory<? extends BroadcastReceiver>>>
                    emptyMap()));
    DaggerApplication_MembersInjector.injectFragmentInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>
                    emptyMap()));
    DaggerApplication_MembersInjector.injectServiceInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends Service>, Provider<AndroidInjector.Factory<? extends Service>>>
                    emptyMap()));
    DaggerApplication_MembersInjector.injectContentProviderInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends ContentProvider>,
                    Provider<AndroidInjector.Factory<? extends ContentProvider>>>
                    emptyMap()));
    DaggerApplication_MembersInjector.injectSetInjected(instance);
    dagger.android.support.DaggerApplication_MembersInjector.injectSupportFragmentInjector(
        instance,
        DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(
            Collections
                .<Class<? extends android.support.v4.app.Fragment>,
                    Provider<AndroidInjector.Factory<? extends android.support.v4.app.Fragment>>>
                    emptyMap()));
    SuffragiumApplication_MembersInjector.injectManagers(
        instance,
        Preconditions.checkNotNull(
            appModule.provideAppManagers(new LeakCanaryManager(), new TimberManager()),
            "Cannot return null from a non-@Nullable @Provides method"));
    return instance;
  }

  private static final class Builder extends AppComponent.Builder {
    private AppModule appModule;

    private SuffragiumApplication seedInstance;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (seedInstance == null) {
        throw new IllegalStateException(
            SuffragiumApplication.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public void seedInstance(SuffragiumApplication arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }
}