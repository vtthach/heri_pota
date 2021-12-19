package ui.charactersDetails

import com.arkivanov.decompose.ComponentContext

interface CharacterDetails {
    fun onCloseClicked()
}

class CharacterDetailsComponent(
    componentContext: ComponentContext,
    itemId: String,
    private val onFinished: () -> Unit
) : CharacterDetails {
    override fun onCloseClicked() {
        onFinished()
    }
}