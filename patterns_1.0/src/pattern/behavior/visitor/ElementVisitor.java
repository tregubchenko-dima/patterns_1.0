package pattern.behavior.visitor;

public class ElementVisitor implements Visitor{
    @Override
    public void visit(JsonElement jsonElement) {
        System.out.println("Processing jsonElement");
    }

    @Override
    public void visit(XmlElement xmlElement) {
        System.out.println("Processing xmlElement");
    }
}
