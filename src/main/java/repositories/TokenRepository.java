package repositories;

import entities.Token;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 15:00 for blog-api project
 */
@ApplicationScoped
public class TokenRepository implements PanacheMongoRepository<Token> {
}
