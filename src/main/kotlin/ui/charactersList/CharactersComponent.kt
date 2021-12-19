package ui

import api.HarryPotterNetworkClient
import com.arkivanov.decompose.ComponentContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.UICharacter

interface CharactersList {
    fun onItemClicked(id: String)
}

class CharactersComponent constructor(
    componentContext: ComponentContext,
    private val networkClient: HarryPotterNetworkClient,
    private val onItemSelected: (id: String) -> Unit
) : CharactersList, ComponentContext by componentContext {

    sealed class CharactersState {
        object Idle : CharactersState()
        object Failed : CharactersState()
        data class Success(val uiCharacters: List<UICharacter>?) : CharactersState()
    }

    suspend fun fetchCharacters(): CharactersState = withContext(Dispatchers.Main) {
        try {
            val charactersResponse = withContext(Dispatchers.IO) {
                networkClient.fetchCharacters()
            }

            when {
                charactersResponse.isSuccessful -> {
                    val characters = charactersResponse.body()?.map { it.toUICharacter() }
                    CharactersState.Success(characters)
                }
                else -> CharactersState.Failed
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            CharactersState.Failed
        }
    }

    override fun onItemClicked(id: String) {
        onItemSelected(id)
    }
}