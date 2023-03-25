package pattern.creational.singleton.v1;

/**
 * Проблемы:
 * -создает экземляр при загрузке класса, поэтому сразу нагружает систему
 * -не предоставляет возможности обработки ошибок
 */
public class SingletonV1 {
    private static final SingletonV1 instance = new SingletonV1();

    private SingletonV1() {}

    public static SingletonV1 getInstance() {
        return instance;
    }
}
