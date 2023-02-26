package data.repositories;

public interface ArticleRepo {

    void createNew(String title, String body);

    void readArticle (int articleId);

    void updateArticle (int authorId, int articleId, String title, String body);

    void deleteArticle (int article);

    long count ();

}
