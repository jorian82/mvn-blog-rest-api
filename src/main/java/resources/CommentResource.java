package resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import models.CommentDTO;
import services.ICommentService;

/**
 * Created by jra, SSDE Inc
 * on Sun, Apr 21 2024
 * at 11:51 PM, blog-api
 */
@Path("/api/v1/comment")
public class CommentResource {
    @Inject
    ICommentService commentService;

    @POST
    public Response add(CommentDTO dto) {
        return commentService.saveComment(dto);
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        return commentService.deleteComment(id);
    }
}
