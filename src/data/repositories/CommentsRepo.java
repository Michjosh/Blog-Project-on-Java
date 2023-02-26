package data.repositories;


import data.models.Articles;
import data.models.Users;

public interface CommentsRepo {

    void createNew(Articles articledId, Users usersId, String comment);

    void readComment (int commentId);

    void updateComment (int commentId,String title);

    void deleteComment (int commentdId);

}
