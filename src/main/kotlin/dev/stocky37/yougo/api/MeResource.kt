package dev.stocky37.yougo.api

import jakarta.ws.rs.Path
import jakarta.ws.rs.container.ResourceContext

@Path("me")
class MeResource {

	@Path("bookmarks")
	fun bookmarks(context: ResourceContext): BookmarksResource {
		return context.getResource(BookmarksResource::class.java)
	}
}
