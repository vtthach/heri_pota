package utils

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.RouterState
import com.arkivanov.decompose.router.pop
import com.arkivanov.decompose.router.push
import com.arkivanov.decompose.router.router
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize
import ui.CharactersComponent
import ui.CharactersList
import ui.charactersDetails.CharacterDetails
import ui.charactersDetails.CharacterDetailsComponent

interface Root {
    val routerState: Value<RouterState<*, Child>>

    sealed class Child {
        class CharactersList(charactersComponent: ui.CharactersList) : Child()
        class CharactersDetails(characterDetails: CharacterDetails) : Child()
    }
}

class RootComponent(
    private val componentContext: ComponentContext
) : Root, ComponentContext by componentContext {

    private val router = router<Config, Root.Child>(
        initialConfiguration = Config.CharactersList,
        handleBackButton = true,
        childFactory = ::createChild
    )

    override val routerState: Value<RouterState<*, Root.Child>> = router.state

    private fun createChild(config: Config, componentContext: ComponentContext): Root.Child {
        return when (config) {
            is Config.CharacterDetails -> Root.Child.CharactersDetails(characterDetails(componentContext, config))
            is Config.CharactersList -> Root.Child.CharactersList(charactersList(componentContext))
        }
    }

    private fun charactersList(componentContext: ComponentContext): CharactersList =
        CharactersComponent(
            componentContext = componentContext,
            onItemSelected = { router.push(Config.CharacterDetails(charactersId = it)) },
            networkClient = TODO()
        )

    private fun characterDetails(
        componentContext: ComponentContext,
        config: Config.CharacterDetails
    ): CharacterDetails =
        CharacterDetailsComponent(
            componentContext = componentContext,
            itemId = config.charactersId,
            onFinished = router::pop
        )

    private sealed class Config : Parcelable {
        @Parcelize
        object CharactersList : Config()

        @Parcelize
        data class CharacterDetails(val charactersId: String) : Config()
    }

}