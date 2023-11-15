package dev.stocky37.yougo.api.json.bookmark

data class BookmarkResponse(
	val id: String,
	override val href: String,
	override val alias: String
) : BookmarkFields
