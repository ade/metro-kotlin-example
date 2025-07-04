package se.ade.example.metro.shared.repos

import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.Provides
import se.ade.example.metro.shared.base.SharedScope
import se.ade.example.metro.shared.base.SomeDomainRepo

/*
This alternative would also enable the ApiGraph to find an implementation.

@ContributesTo(SharedScope::class)
interface ReposGraph {
	@Provides fun someDomainRepo(): SomeDomainRepo {
		return SomeDomainRepoImpl()
	}
}
*/