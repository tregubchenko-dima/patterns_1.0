package pattern.behavior.observer;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscriber();
    void addArticle(String article);
}
