package se.ade.example.metro.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.createGraph
import kotlinx.coroutines.runBlocking
import se.ade.example.metro.app.di.PlatformCommentator
import se.ade.example.metro.shared.api.ApiGraph

class MainActivity : ComponentActivity() {
	@Inject private lateinit var platformCommentator: PlatformCommentator

	override fun onCreate(savedInstanceState: Bundle?) {
		enableEdgeToEdge()
		super.onCreate(savedInstanceState)

		application.graph.inject(this)

		val data = runBlocking {
			createGraph<ApiGraph>()
				.getSomeDomainRepo()
				.getSomeData()
		}

		setContent {
			App(platformCommentator.comment(), data.foo)
		}
	}
}

@Preview
@Composable
fun AppAndroidPreview() {
	App("preview", "preview")
}