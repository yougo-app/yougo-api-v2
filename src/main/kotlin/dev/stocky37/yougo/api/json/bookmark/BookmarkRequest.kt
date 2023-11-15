package dev.stocky37.yougo.api.json.bookmark

data class BookmarkRequest(
	override val href: String,
	override val alias: String
) : BookmarkFields
