package pattern.behavior.visitor;

public class XmlElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
