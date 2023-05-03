package pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document implements Element{

    private final List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
