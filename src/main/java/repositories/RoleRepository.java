package repositories;

import entities.Role;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 12:02 for blog-api project
 */
@ApplicationScoped
public class RoleRepository implements PanacheMongoRepository<Role> {
}
