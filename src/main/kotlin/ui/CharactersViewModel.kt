package ui

import api.HarryPotterNetworkClient
import model.Character
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val networkClient: HarryPotterNetworkClient
) : BaseViewModel {

    sealed class CharactersState {
        object Idle : CharactersState()
        object Failed : CharactersState()
        data class Success(val data: List<Character>?) : CharactersState()
    }

    suspend fun fetchCharacters(): CharactersState {
        return try {
            val charactersResponse = networkClient.fetchCharacters()

            when {
                charactersResponse.isSuccessful -> CharactersState.Success(charactersResponse.body())
                else -> CharactersState.Failed
            }
        } catch (exception: Exception) {
            CharactersState.Failed
        }
    }

    override fun dispose() {
    }
}