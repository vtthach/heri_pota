package ui;

import api.HarryPotterNetworkClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CharactersViewModel_Factory implements Factory<CharactersViewModel> {
  private final Provider<HarryPotterNetworkClient> networkClientProvider;

  public CharactersViewModel_Factory(Provider<HarryPotterNetworkClient> networkClientProvider) {
    this.networkClientProvider = networkClientProvider;
  }

  @Override
  public CharactersViewModel get() {
    return newInstance(networkClientProvider.get());
  }

  public static CharactersViewModel_Factory create(
      Provider<HarryPotterNetworkClient> networkClientProvider) {
    return new CharactersViewModel_Factory(networkClientProvider);
  }

  public static CharactersViewModel newInstance(HarryPotterNetworkClient networkClient) {
    return new CharactersViewModel(networkClient);
  }
}
