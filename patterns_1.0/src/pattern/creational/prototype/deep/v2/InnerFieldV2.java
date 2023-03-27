package pattern.creational.prototype.deep.v2;

public class InnerFieldV2 implements Prototype<InnerFieldV2>{

    private int id;
    private String name;

    public InnerFieldV2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public InnerFieldV2(InnerFieldV2 toCopy) {
        this.id = toCopy.id;
        this.name = toCopy.name;
    }

    @Override
    public InnerFieldV2 clone() {
        return new InnerFieldV2(this);
    }

    @Override
    public String toString() {
        return "InnerFieldV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
