package dev.stocky37.yougo.api

import dev.stocky37.yougo.api.json.bookmark.BookmarkRequest
import dev.stocky37.yougo.api.json.bookmark.BookmarkResponse
import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.NotFoundException
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.container.ResourceContext

@ApplicationScoped
class BookmarksResource() {


	@GET
	fun list(): List<BookmarkResponse> {
		return emptyList()
	}

	@POST
	fun create(bookmark: BookmarkRequest): BookmarkResponse {
		throw NotFoundException()
	}

	@GET
	@Path("alias/{alias}")
	fun findByAlias(alias: String): BookmarkResponse? {
		return BookmarkResponse("found-by-alias", "", alias)
	}

	@Path("{id}")
	fun bookmark(id: String, context: ResourceContext): BookmarkResource {
		return context.getResource(BookmarkResource::class.java)
	}
}
