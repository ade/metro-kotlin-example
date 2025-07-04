package se.ade.example.metro.app

import dev.zacsweers.metro.createGraphFactory
import se.ade.example.metro.app.di.AndroidAppGraph
import android.app.Application as AndroidApplication

class Application: AndroidApplication() {
	val graph: AndroidAppGraph by lazy {
		createGraphFactory<AndroidAppGraph.Factory>().create(this)
	}
}

val AndroidApplication.graph get() = (this.applicationContext as Application).graph