package pattern.creational.prototype.deep.v1;

public class InnerFieldV1 implements Cloneable{

    private int id;
    private String name;


    public InnerFieldV1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected InnerFieldV1 clone() throws CloneNotSupportedException {
        return (InnerFieldV1)super.clone();
    }

    @Override
    public String toString() {
        return "InnerField{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
