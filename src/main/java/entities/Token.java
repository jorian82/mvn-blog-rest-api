package entities;

import org.bson.types.ObjectId;

import java.time.LocalDateTime;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 12:17 for blog-api project
 */
public class Token {
    public ObjectId id;
    public String token;
    public String user_id;
    public LocalDateTime createdDate;
    public LocalDateTime expiresAt;
}
