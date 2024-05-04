package entities;

import org.bson.types.ObjectId;

/**
 * Created by jra, SSDE Inc
 * on Sun, Apr 21 2024
 * at 17:54, blog-api
 */
public class User {
    public ObjectId id;
    public String username;
    public String password;
    public String email;
    public String role;
}
