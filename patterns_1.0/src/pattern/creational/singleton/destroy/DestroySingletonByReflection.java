package pattern.creational.singleton.destroy;

import pattern.creational.singleton.v1.SingletonV1;

import java.lang.reflect.Constructor;

public class DestroySingletonByReflection {

    public static void main(String[] args) {
        SingletonV1 singleton1 = SingletonV1.getInstance();
        SingletonV1 singleton2 = null;
        try {
            Constructor[] constructors = SingletonV1.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                singleton2 = (SingletonV1) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            throw new RuntimeException("Some error");
        }
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
