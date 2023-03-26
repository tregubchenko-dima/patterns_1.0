package pattern.creational.singleton.v2;

/**
 * Проблемы:
 * -создает экземляр при загрузке класса, поэтому сразу нагружает систему
 */
public class SingletonV2 {

    private static SingletonV2 instance;

    static {
        try {
            instance = new SingletonV2();
        } catch (Exception e) {
            throw new RuntimeException("Error during creation an instance of SingletonV2");
        }
    }

    private SingletonV2(){}

    public static SingletonV2 getInstance() {
        return instance;
    }
}
