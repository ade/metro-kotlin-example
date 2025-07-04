package se.ade.example.metro.metro_example

interface Platform {
	val name: String
}

expect fun getPlatform(): Platform