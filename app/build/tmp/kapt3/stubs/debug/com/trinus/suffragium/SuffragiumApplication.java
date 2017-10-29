package com.trinus.suffragium;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/trinus/suffragium/SuffragiumApplication;", "Ldagger/android/support/DaggerApplication;", "()V", "managers", "Lcom/trinus/suffragium/manager/AppManagers;", "getManagers", "()Lcom/trinus/suffragium/manager/AppManagers;", "setManagers", "(Lcom/trinus/suffragium/manager/AppManagers;)V", "applicationInjector", "Ldagger/android/AndroidInjector;", "onCreate", "", "app_debug"})
public final class SuffragiumApplication extends dagger.android.support.DaggerApplication {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.trinus.suffragium.manager.AppManagers managers;
    
    @org.jetbrains.annotations.NotNull()
    public final com.trinus.suffragium.manager.AppManagers getManagers() {
        return null;
    }
    
    public final void setManagers(@org.jetbrains.annotations.NotNull()
    com.trinus.suffragium.manager.AppManagers p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        return null;
    }
    
    public SuffragiumApplication() {
        super();
    }
}