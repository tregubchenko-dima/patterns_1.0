package pattern.creational.prototype.simple.v2;

public class SimplePrototypeV2 implements Prototype<SimplePrototypeV2> {

    private int id;
    private String name;
    private int age;

    public SimplePrototypeV2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public SimplePrototypeV2(SimplePrototypeV2 toCopy) {
        this(toCopy.id, toCopy.name, toCopy.age);
    }

    @Override
    public SimplePrototypeV2 clone() {
        return new SimplePrototypeV2(this);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SimplePrototypeV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
