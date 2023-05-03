package pattern.behavior.observer;

public class ObserverTest {

    public static void main(String[] args) {
        Subscriber subscriber1 = new ArticleSubscriber();
        Subscriber subscriber2 = new ArticleSubscriber();

        ArticlePublisher articlePublisher = new ArticlePublisher();
        articlePublisher.addSubscriber(subscriber1);
        articlePublisher.addSubscriber(subscriber2);

        articlePublisher.addArticle("ArticleTopic#1");
        articlePublisher.addArticle("ArticleTopic#2");
    }
}
