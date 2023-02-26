package data.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Comment {
    private int id;
    private Articles articlesId;
    private Users usersId;
    private LocalDateTime timeCreated = LocalDateTime.now();
    private String comment;

    public Comment(int id, Articles articlesId, Users usersId, Date date, String comment) {
        this.id = id;
        this.articlesId = articlesId;
        this.usersId = usersId;
        this.timeCreated = timeCreated;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleId() {
        return articlesId.getArticleId();
    }

    public int getUserId() {
        return usersId.getId();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }
}

