package com.trinus.suffragium.di;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/trinus/suffragium/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/trinus/suffragium/SuffragiumApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.trinus.suffragium.di.ViewModelBuilder.class, com.trinus.suffragium.network.NetworkModule.class, com.trinus.suffragium.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.trinus.suffragium.SuffragiumApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/trinus/suffragium/di/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/trinus/suffragium/SuffragiumApplication;", "()V", "app_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.trinus.suffragium.SuffragiumApplication> {
        
        public Builder() {
            super();
        }
    }
}