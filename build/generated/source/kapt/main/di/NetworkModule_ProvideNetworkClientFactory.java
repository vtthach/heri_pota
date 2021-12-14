package di;

import api.HarryPotterNetworkClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideNetworkClientFactory implements Factory<HarryPotterNetworkClient> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideNetworkClientFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public HarryPotterNetworkClient get() {
    return provideNetworkClient(retrofitProvider.get());
  }

  public static NetworkModule_ProvideNetworkClientFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideNetworkClientFactory(retrofitProvider);
  }

  public static HarryPotterNetworkClient provideNetworkClient(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideNetworkClient(retrofit));
  }
}
