package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import models.PostDTO;
import org.jboss.resteasy.reactive.RestQuery;
import services.IPostService;

/**
 * Created by jra, SSDE Inc
 * on Sun, Apr 21 2024
 * at 23:24, blog-api
 */
@Path("/api/v1/post")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PostResource {
    @Inject
    IPostService postService;

    @GET
    public Response search() {
        return postService.getAllPosts();
    }

    @POST
    public Response savePost(PostDTO dto) {
        return postService.savePost(dto);
    }

    @PATCH
    public Response updatePost(PostDTO dto) {
        return postService.updatePost(dto);
    }

    @DELETE
    @Path("/{id}")
    public Response deletePost(@QueryParam("id") String id) {
        return postService.deletePost(id);
    }
}
