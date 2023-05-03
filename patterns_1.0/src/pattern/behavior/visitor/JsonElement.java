package pattern.behavior.visitor;

public class JsonElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
