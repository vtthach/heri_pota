package ui

import api.HarryPotterNetworkClient
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import model.Character
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val networkClient: HarryPotterNetworkClient
) : BaseViewModel {
    private val _state: MutableStateFlow<CharactersState> = MutableStateFlow(CharactersState.Idle)
    private val state: StateFlow<CharactersState> = _state.asStateFlow()
    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, _ ->
        _state.value = CharactersState.Failed
    }
    private val job = SupervisorJob()
    private val coroutineScope = CoroutineScope(job + Dispatchers.IO)

    sealed class CharactersState {
        object Idle : CharactersState()
        object Failed : CharactersState()
        data class Success(val data: List<Character>?) : CharactersState()
    }

    fun fetchCharacters() {
        coroutineScope.launch(coroutineExceptionHandler) {
            val charactersResponse = networkClient.fetchCharacters()

            when {
                charactersResponse.isSuccessful ->
                    _state.value = CharactersState.Success(charactersResponse.body())
                else -> _state.value = CharactersState.Failed
            }
        }
    }

    override fun dispose() {
        job.cancel()
    }
}