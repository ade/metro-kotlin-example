package se.ade.example.metro.shared.api

import dev.zacsweers.metro.DependencyGraph
import se.ade.example.metro.shared.base.SharedScope
import se.ade.example.metro.shared.base.SomeDomainRepo

@DependencyGraph(scope = SharedScope::class)
interface ApiGraph {
	fun getSomeDomainRepo(): SomeDomainRepo
}