package se.ade.example.metro.shared.base

interface SomeDomainRepo {
	suspend fun getSomeData(): SomeDomainData
}