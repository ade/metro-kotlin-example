package se.ade.example.metro.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.zacsweers.metro.Inject
import se.ade.example.metro.app.di.PlatformCommentator

class MainActivity : ComponentActivity() {
	@Inject private lateinit var platformCommentator: PlatformCommentator

	override fun onCreate(savedInstanceState: Bundle?) {
		enableEdgeToEdge()
		super.onCreate(savedInstanceState)

		application.graph.inject(this)

		setContent {
			App(platformCommentator.comment())
		}
	}
}

@Preview
@Composable
fun AppAndroidPreview() {
	App("preview")
}