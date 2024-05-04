package models;

import java.time.LocalDateTime;

/**
 * Created by jra, SSDE Inc.
 * on Tuesday, Apr 30, 2024
 * at 12:35 for blog-api project
 */
public class TokenDTO {
    private String token;
    private String user_id;
    private LocalDateTime expiresAt;
}
