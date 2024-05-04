package repositories;

import entities.Comment;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 11:55 for blog-api project
 */
@ApplicationScoped
public class CommentRepository implements PanacheMongoRepository<Comment> {
}
