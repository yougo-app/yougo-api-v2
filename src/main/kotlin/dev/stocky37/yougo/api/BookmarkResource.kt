package dev.stocky37.yougo.api

import dev.stocky37.yougo.api.json.bookmark.BookmarkPatchRequest
import dev.stocky37.yougo.api.json.bookmark.BookmarkRequest
import dev.stocky37.yougo.api.json.bookmark.BookmarkResponse
import io.quarkus.arc.Unremovable
import jakarta.enterprise.context.RequestScoped
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.DELETE
import jakarta.ws.rs.GET
import jakarta.ws.rs.NotFoundException
import jakarta.ws.rs.PATCH
import jakarta.ws.rs.PathParam
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.jboss.resteasy.reactive.RestPath

@RequestScoped
@Unremovable
class BookmarkResource() {

	@GET
	fun find(id: String): BookmarkResponse? {
		return null
//		return BookmarkResponse(id, "", "found-by-id")
	}

	@PATCH
	fun update(@RestPath id: String, patch: BookmarkPatchRequest): BookmarkResponse? {
		return null
	}

	@DELETE
	fun delete(id: String): BookmarkResponse? {
		return null;
	}
}
