package ui

import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.IntSize

const val DEFAULT_WIDTH = 500
const val DEFAULT_HEIGHT = 500

@Composable
fun CharactersView() =
    Window(
        title = "Harry Potter",
        size = IntSize(DEFAULT_WIDTH, DEFAULT_HEIGHT),
    ) {
//            val mainOutput = remember { mutableStateOf(TextFieldValue("0")) }
//            Column(Modifier.fillMaxHeight()) {
//                DisplayPanel(
//                    Modifier.weight(1f),
//                    mainOutput
//                )
//                Keyboard(
//                    Modifier.weight(4f),
//                    mainOutput
//                )
//            }
    }