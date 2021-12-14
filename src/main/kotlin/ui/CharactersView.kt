package ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import di.Injector

@Composable
fun CharactersView(injector: Injector) {
    val viewModel: CharactersViewModel = injector.applicationComponent.charactersViewModel
    var state by remember {
        mutableStateOf<CharactersViewModel.CharactersState>(CharactersViewModel.CharactersState.Idle)
    }

    LaunchedEffect(Unit) {
        state = viewModel.fetchCharacters()
    }

    when (state) {
        is CharactersViewModel.CharactersState.Failed -> println("Failed")
        is CharactersViewModel.CharactersState.Idle -> println("Idle")
        is CharactersViewModel.CharactersState.Success -> {
            val st = (state as CharactersViewModel.CharactersState.Success)
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(items = st.data.orEmpty(), itemContent = {
                    Text(it.name)
                })
            }
        }
    }
}