package se.ade.example.metro.app.di

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.SingleIn

@Inject
@SingleIn(AppScope::class)
class PlatformCommentator(private val platformInfo: PlatformInfo) {
	fun comment(): String {
		return "This is a ${platformInfo.type} type of platform."
	}
}