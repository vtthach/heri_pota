// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import di.Injector
import ui.CharactersView

@Composable
@Preview
fun App() {
    val injector = Injector()
    MaterialTheme {
        CharactersView(injector)
    }
}

fun main() = application {
    val windowState = rememberWindowState()
    Window(onCloseRequest = ::exitApplication, title = "Heri Pota") {
        App()
    }
}
