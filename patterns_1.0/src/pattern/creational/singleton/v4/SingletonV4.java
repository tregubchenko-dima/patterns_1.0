package pattern.creational.singleton.v4;

/**
 * Реализации не требует синхронизации, т.к. статический класс будет загружен
 * при первом обращении к его полю, что позволит создать экземляр один раз
 * и в требующийся момент
 */
public class SingletonV4 {

    private SingletonV4() {}

    public static SingletonV4 getInstance() {
        return InnerSingleton.instance;
    }

    private static class InnerSingleton {
        private static final SingletonV4 instance = new SingletonV4();
    }
}
