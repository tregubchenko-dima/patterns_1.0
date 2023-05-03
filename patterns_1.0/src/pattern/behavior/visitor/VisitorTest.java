package pattern.behavior.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        Visitor visitor = new ElementVisitor();

        Document document = new Document();
        document.addElement(new JsonElement());
        document.addElement(new JsonElement());
        document.addElement(new XmlElement());

        document.accept(visitor);
    }
}
