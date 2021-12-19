// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.lifecycle.LifecycleController
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import di.Injector
import ui.CharactersView
import utils.RootComponent

@Composable
@Preview
fun App(root: RootComponent) {
    val injector = Injector()
    MaterialTheme {
        CharactersView(root, injector)
    }
}

@OptIn(ExperimentalDecomposeApi::class)
fun main() = application {
    val windowState = rememberWindowState()
    val lifecycle = LifecycleRegistry()
    val root = RootComponent(DefaultComponentContext(lifecycle))

    LifecycleController(lifecycle, windowState)

    Window(onCloseRequest = ::exitApplication, title = "Heri Pota") {
        App(root)
    }
}
