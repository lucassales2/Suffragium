package com.trinus.suffragium.di;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/trinus/suffragium/di/AppModule;", "", "()V", "provideAppManagers", "Lcom/trinus/suffragium/manager/AppManagers;", "leakCanaryManager", "Lcom/trinus/suffragium/manager/LeakCanaryManager;", "timberManager", "Lcom/trinus/suffragium/manager/TimberManager;", "provideAppPreferences", "Landroid/content/SharedPreferences;", "application", "Lcom/trinus/suffragium/SuffragiumApplication;", "provideCacheDir", "Ljava/io/File;", "provideContext", "Landroid/content/Context;", "provideRxSchedulers", "Lcom/trinus/suffragium/util/AppRxSchedulers;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.SuffragiumApplication application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.trinus.suffragium.util.AppRxSchedulers provideRxSchedulers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    @javax.inject.Named(value = "app")
    public final android.content.SharedPreferences provideAppPreferences(@org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.SuffragiumApplication application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cache")
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.io.File provideCacheDir(@org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.SuffragiumApplication application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.trinus.suffragium.manager.AppManagers provideAppManagers(@org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.manager.LeakCanaryManager leakCanaryManager, @org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.manager.TimberManager timberManager) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}