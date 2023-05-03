package pattern.behavior.visitor;

public interface Visitor {
    void visit(JsonElement jsonElement);
    void visit(XmlElement xmlElement);
}
