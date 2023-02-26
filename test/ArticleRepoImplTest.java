
import data.repositories.ArticleRepoImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArticleRepoImplTest {
    ArticleRepoImpl blogArticle;

    @BeforeEach
    void setup (){
        blogArticle = new ArticleRepoImpl();
        blogArticle.createNew("The Great Day", "Its all about the great day of the Lord, which is coming soon.");
    }

    @Test
    void createNewArticleTest (){
        assertEquals(1, blogArticle.count());
    }

    @Test
    void readArticleTest (){
        blogArticle.readArticle(0);
        String expected = String.format("""
               =============================
               Article Title: The Great Day
               Article Body: Its all about the great day of the Lord, which is coming soon.               
               Author's ID: 101
               Time Stamp: %s
               =============================
               """, new Date());
        System.out.println(blogArticle.findArticle(1));
        assertEquals(expected, blogArticle.findArticle(1).toString());
    }
    @Test
    void updateArticleTest(){
        blogArticle.updateArticle(101,1, "Things are changing", "Everything on earth are subject to change");
        String expected = String.format("""
               =============================
               Article Title: Things are changing
               Article Body: Everything on earth are subject to change               
               Author's ID: 101
               Time Stamp: %s
               =============================
               """, new Date());

        assertEquals(expected, blogArticle.findArticle(1).toString());
    }

    @Test
    void deleteArticleTest(){
        blogArticle.deleteArticle(1);
        assertEquals(0, blogArticle.count());
    }

    @Test
    void readAllArticleTest(){
        blogArticle.readAllArticle();
        String expected = String.format("""
               =============================
               Article Title: The Great Day
               Article Body: Its all about the great day of the Lord, which is coming soon.               
               Author's ID: 101
               Time Stamp: %s
               =============================
               """, new Date());
        assertEquals(expected, blogArticle.findAllArticles(1).toString());
    }
}
