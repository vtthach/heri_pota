package ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.unit.dp
import di.Injector
import model.UICharacter

@Composable
fun CharactersView(injector: Injector) {
    val viewModel: CharactersViewModel = injector.applicationComponent.charactersViewModel
    var state by remember {
        mutableStateOf<CharactersViewModel.CharactersState>(CharactersViewModel.CharactersState.Idle)
    }
    var text by rememberSaveable { mutableStateOf("") }
    var list by rememberSaveable { mutableStateOf(listOf<UICharacter>()) }
    val listHelper = mutableListOf<UICharacter>()

    LaunchedEffect(Unit) {
        state = viewModel.fetchCharacters()
    }

    when (state) {
        is CharactersViewModel.CharactersState.Failed -> println("Failed")
        is CharactersViewModel.CharactersState.Idle -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                LinearProgressIndicator()
            }
        }
        is CharactersViewModel.CharactersState.Success -> {
            val currentState = (state as CharactersViewModel.CharactersState.Success)
            list = currentState.uiCharacters.orEmpty()
            listHelper.addAll(currentState.uiCharacters.orEmpty())
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {
                    TextField(
                        value = text,
                        onValueChange = { string ->
                            text = string
                            list = listHelper.filter { it.name.contains(string, ignoreCase = true) }
                        },
                        modifier = Modifier.fillMaxSize(),
                        label = { Text("Search") }
                    )
                }
                items(items = list, itemContent = {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize().padding(8.dp),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            Image(
                                bitmap = it.imageBitmap ?: ImageBitmap(
                                    width = 80, height = 80, config = ImageBitmapConfig.Alpha8
                                ),
                                contentDescription = it.name,
                                modifier = Modifier.width(80.dp).height(80.dp).align(Alignment.CenterVertically)
                            )
                            Column(modifier = Modifier.padding(8.dp)) {
                                Row {
                                    Text("Name: ")
                                    Text(it.name)
                                }
                                Row {
                                    Text("Ancestry: ")
                                    Text(it.ancestry)
                                }
                                Row {
                                    Text("Species: ")
                                    Text(it.species)
                                }
                                Row {
                                    Text("Gender: ")
                                    Text(it.gender)
                                }
                                Row {
                                    Text("House: ")
                                    Text(it.house)
                                }
                                Row {
                                    Text("Wand: ")
                                    Row {
                                        Text(it.wand.core)
                                        Text(",")
                                        Text(it.wand.wood)
                                    }
                                }
                                Row {
                                    Text("Patronous: ")
                                    Text(it.patronus)
                                }
                            }
                        }
                        Divider(color = Color.LightGray)
                    }
                })
            }
        }
    }
}
