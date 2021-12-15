package ui

import api.HarryPotterNetworkClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import model.UICharacter
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val networkClient: HarryPotterNetworkClient
) {

    sealed class CharactersState {
        object Idle : CharactersState()
        object Failed : CharactersState()
        data class Success(val uiCharacters: List<UICharacter>?) : CharactersState()
    }

    suspend fun fetchCharacters(): CharactersState = withContext(Dispatchers.IO) {
        try {
            val charactersResponse = networkClient.fetchCharacters()

            when {
                charactersResponse.isSuccessful -> {
                    val characters = charactersResponse.body()?.map { it.toUICharacter() }
                    withContext(Dispatchers.Main) {
                        CharactersState.Success(characters)
                    }
                }
                else -> withContext(Dispatchers.Main) {
                    CharactersState.Failed
                }
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            withContext(Dispatchers.Main) {
                CharactersState.Failed
            }
        }
    }
}