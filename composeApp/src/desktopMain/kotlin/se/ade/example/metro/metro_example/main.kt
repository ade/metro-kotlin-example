package se.ade.example.metro.metro_example

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