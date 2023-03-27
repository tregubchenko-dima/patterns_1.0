package pattern.creational.prototype.simple.v1;

public class SimplePrototypeV1 implements Cloneable{

    private int id;
    private String name;
    private int age;

    public SimplePrototypeV1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public SimplePrototypeV1 clone() throws CloneNotSupportedException {
        return (SimplePrototypeV1) super.clone();
    }

    @Override
    public String toString() {
        return "SimplePrototypeV1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
