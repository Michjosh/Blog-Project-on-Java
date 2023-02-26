package data.models;

import java.util.Date;

public class Articles {
    private int id;
    private String title;
    private  String body;
    private Comment comment;
    private final Date timeCreated;

    public Articles(int id, String title, String body, Date timeCreated, int authorId, Comment comment) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.timeCreated = timeCreated;
        this.authorId = authorId;
    }

    private final int authorId;

    public int getArticleId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public int getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return String.format("""
                =============================      
                Article Title: %s
                Article Body: %s
                Author's ID: %s
                Time Stamp: %s
                =============================
                """
                , getTitle(), getBody(), getAuthorId(), getTimeCreated());
    }

    public String getComments() {
        return comment.getComment();
    }
}
