package di

import dagger.Component
import ui.CharactersComponent
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    val charactersViewModel: CharactersComponent
}