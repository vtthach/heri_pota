package di;

import java.lang.System;

@kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\bH\u0007J\u0012\u0010\u0010\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ldi/NetworkModule;", "", "()V", "BaseUrl", "", "OKHttpTimeout", "", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideNetworkClient", "Lapi/HarryPotterNetworkClient;", "retrofit", "Lretrofit2/Retrofit;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "provideRetrofitInstance", "okHttpClient", "untitled"})
@dagger.Module
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull
    public static final di.NetworkModule INSTANCE = null;
    private static final long OKHttpTimeout = 100L;
    private static final java.lang.String BaseUrl = "https://ws.audioscrobbler.com/";
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @InternalApi
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @InternalApi
    @dagger.Provides
    @javax.inject.Singleton
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull
    @InternalApi
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @InternalApi
    @javax.inject.Singleton
    @dagger.Provides
    public final retrofit2.Retrofit provideRetrofitInstance(@org.jetbrains.annotations.NotNull
    @InternalApi
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @javax.inject.Singleton
    @dagger.Provides
    public final api.HarryPotterNetworkClient provideNetworkClient(@org.jetbrains.annotations.NotNull
    @InternalApi
    retrofit2.Retrofit retrofit) {
        return null;
    }
}