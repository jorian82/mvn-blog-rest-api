package repositories;

import entities.Post;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 11:31 for blog-api project
 */
@ApplicationScoped
public class PostRepository implements PanacheMongoRepository<Post> {
}
