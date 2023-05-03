package pattern.behavior.observer;

public class ArticleSubscriber implements Subscriber{

    @Override
    public void read(String article) {
        System.out.println("I'm reading the article:" + article);
    }
}
