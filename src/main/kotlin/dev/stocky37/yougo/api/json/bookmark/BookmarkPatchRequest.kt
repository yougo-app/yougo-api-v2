package dev.stocky37.yougo.api.json.bookmark

data class BookmarkPatchRequest(
	override val href: String?,
	override val alias: String?
) : BookmarkFields
