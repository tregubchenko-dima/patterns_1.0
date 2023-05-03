package pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ArticlePublisher implements Publisher{

    private final List<Subscriber> subscribers = new ArrayList<>();
    private final List<String> articles = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber subscriber : subscribers) {
            subscriber.read(articles.get(articles.size() - 1));
        }
    }

    @Override
    public void addArticle(String article) {
        articles.add(article);
        notifySubscriber();
    }
}
