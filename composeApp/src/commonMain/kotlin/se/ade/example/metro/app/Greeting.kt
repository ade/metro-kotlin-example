package se.ade.example.metro.app

class Greeting {
	private val platform = getPlatform()

	fun greet(): String {
		return "Hello, ${platform.name}!"
	}
}