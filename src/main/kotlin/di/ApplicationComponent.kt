package di

import dagger.Component
import ui.CharactersViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    val charactersViewModel: CharactersViewModel
}