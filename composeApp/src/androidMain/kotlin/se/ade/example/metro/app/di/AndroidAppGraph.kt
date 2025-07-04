package se.ade.example.metro.app.di

import android.content.Context
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import se.ade.example.metro.app.MainActivity

@DependencyGraph(scope = AppScope::class)
interface AndroidAppGraph: AppGraph {
	fun inject(activity: MainActivity)

	@Provides override val message: String
		get() = "Hello from Android!"

	@Provides private fun platformInfo(): PlatformInfo {
		return PlatformInfo(type = "Android")
	}

	@DependencyGraph.Factory
	interface Factory {
		fun create(@Provides context: Context): AndroidAppGraph
	}
}