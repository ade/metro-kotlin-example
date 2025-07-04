package se.ade.example.metro.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
	Window(
		onCloseRequest = ::exitApplication,
		title = "metro_example",
	) {
		App()
	}
}