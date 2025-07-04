package se.ade.example.metro.shared.repos

import dev.zacsweers.metro.ContributesBinding
import dev.zacsweers.metro.Inject
import se.ade.example.metro.shared.base.SharedScope
import se.ade.example.metro.shared.base.SomeDomainData
import se.ade.example.metro.shared.base.SomeDomainRepo

@ContributesBinding(SharedScope::class)
@Inject
class SomeDomainRepoImpl: SomeDomainRepo {
	override suspend fun getSomeData(): SomeDomainData {
		return SomeDomainData("Real domain data from SomeDomainRepoImpl")
	}
}