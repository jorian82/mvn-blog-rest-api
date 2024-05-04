package entities;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by jra, SSDE Inc
 * on Sun, Apr 21 2024
 * at 17:54, blog-api
 */
public class Post {
    public ObjectId id;
    public String title;
    public String content;
    public String author;
    public Integer votes;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
}
