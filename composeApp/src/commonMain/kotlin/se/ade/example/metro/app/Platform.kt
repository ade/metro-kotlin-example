package se.ade.example.metro.app

interface Platform {
	val name: String
}

expect fun getPlatform(): Platform