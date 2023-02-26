package data.repositories;

import data.models.Articles;
import data.models.Comment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleRepoImpl implements ArticleRepo {

    List <Articles> articles = new ArrayList<>();

    private Comment comment;

    private int articleId = 1;

    private int authorId = 101;

    @Override
    public void createNew(String title, String body) {
        Articles articles1 = new Articles(articleId, title, body, new Date(), authorId, comment);
        articles.add(articles1);
        articleId++;
        authorId++;
    }

    @Override
    public void readArticle(int articleId) {
        for (Articles articles : this.articles) {
            if (articles.getArticleId() == articleId) {
                System.out.println("ID: " + articles.getArticleId());
                System.out.println("Title: " + articles.getTitle());
                System.out.println("Body: " + articles.getBody());
                System.out.println("Time Stamp: " + articles.getTimeCreated());
                return;
            }
        }
    }

    @Override
    public void updateArticle(int authorId, int articleId, String title, String body) {
        for (Articles articles1 : articles) {
            if (articles1.getArticleId() == articleId) {
                articles1.setTitle(title);
                articles1.setBody(body);
                return;
            }
        }
    }

    @Override
    public void deleteArticle(int article) {
        for (Articles articles1 : articles) {
            if (articles1.getArticleId() == article) {
                articles.remove(articles1);
                return;
            }
        }
    }

    @Override
    public long count() {
        return articles.size();
    }

    public Articles findArticle(int articleId){
        return articles.get(articleId-1);
    }

    public void readAllArticle() {
        for (Articles articles : this.articles) {
            System.out.println(articles.toString());
        }
    }

    public Articles findAllArticles(int articleId) {
        return articles.get(articleId-1);
    }
}