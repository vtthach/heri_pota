package di;

import api.HarryPotterNetworkClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import ui.CharactersViewModel;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationComponent implements ApplicationComponent {
  private final DaggerApplicationComponent applicationComponent = this;

  private Provider<HttpLoggingInterceptor> provideLoggingInterceptorProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Retrofit> provideRetrofitInstanceProvider;

  private Provider<HarryPotterNetworkClient> provideNetworkClientProvider;

  private DaggerApplicationComponent() {

    initialize();

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize() {
    this.provideLoggingInterceptorProvider = DoubleCheck.provider(NetworkModule_ProvideLoggingInterceptorFactory.create());
    this.provideOkHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideOkHttpClientFactory.create(provideLoggingInterceptorProvider));
    this.provideRetrofitInstanceProvider = DoubleCheck.provider(NetworkModule_ProvideRetrofitInstanceFactory.create(provideOkHttpClientProvider));
    this.provideNetworkClientProvider = DoubleCheck.provider(NetworkModule_ProvideNetworkClientFactory.create(provideRetrofitInstanceProvider));
  }

  @Override
  public CharactersViewModel getCharactersViewModel() {
    return new CharactersViewModel(provideNetworkClientProvider.get());
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public ApplicationComponent build() {
      return new DaggerApplicationComponent();
    }
  }
}
