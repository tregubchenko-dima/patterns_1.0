package pattern.creational.prototype.deep.v2;

public class DeepPrototypeV2 implements Prototype<DeepPrototypeV2> {

    private int id;
    private InnerFieldV2 innerField;

    public DeepPrototypeV2(int id, InnerFieldV2 innerField) {
        this.id = id;
        this.innerField = innerField;
    }

    public DeepPrototypeV2(DeepPrototypeV2 toCopy) {
        this(toCopy.id, toCopy.innerField);
    }

    @Override
    public DeepPrototypeV2 clone() {
        DeepPrototypeV2 deepPrototypeV2 = new DeepPrototypeV2(this);
        deepPrototypeV2.innerField = innerField.clone();
        return deepPrototypeV2;
    }

    @Override
    public String toString() {
        return "DeepPrototypeV2{" +
                "id=" + id +
                ", innerField=" + innerField +
                '}';
    }
}
