package data.repositories;

import data.models.Articles;
import data.models.Comment;
import data.models.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentsRepoImpl implements CommentsRepo {

    private List<Comment> comments = new ArrayList<>();

    private Articles articles;

    private Users users;

    @Override
    public void createNew(Articles articlesId, Users usersId, String comment) {
        int commentId = 1;
        Comment comment1 = new Comment(commentId, articlesId, usersId, new Date(), comment );

    }

    @Override
    public void readComment(int commentId) {

    }

    @Override
    public void updateComment(int commentId, String title) {

    }

    @Override
    public void deleteComment(int commentId) {

    }

    public int countComments() {
        return 0;
    }
}
