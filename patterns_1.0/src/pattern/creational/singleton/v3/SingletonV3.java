package pattern.creational.singleton.v3;

/**
 * Оптимизированный подход к реализации паттерна Singleton
 */
public class SingletonV3 {

    private static SingletonV3 instance;

    private SingletonV3(){}

    public static SingletonV3 getInstance() {
        if (instance == null) {
            synchronized (SingletonV3.class) {
                if (instance == null) {
                    instance = new SingletonV3();
                }
            }
        }
        return instance;
    }
}
