package pattern.creational.prototype.deep.v1;

public class DeepPrototypeV1 implements Cloneable{

    private int id;
    private InnerFieldV1 innerField;

    public DeepPrototypeV1(int id, InnerFieldV1 innerField) {
        this.id = id;
        this.innerField = innerField;
    }

    @Override
    protected DeepPrototypeV1 clone() throws CloneNotSupportedException {
        DeepPrototypeV1 deepPrototypeV1 = (DeepPrototypeV1) super.clone();
        deepPrototypeV1.innerField = (InnerFieldV1) deepPrototypeV1.innerField.clone();
        return deepPrototypeV1;
    }

    @Override
    public String toString() {
        return "DeepPrototypeV1{" +
                "id=" + id +
                ", innerField=" + innerField +
                '}';
    }
}
