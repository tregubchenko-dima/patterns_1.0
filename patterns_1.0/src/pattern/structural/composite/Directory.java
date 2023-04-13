package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{

    private final String directoryName;

    List<Component> directoryComponents = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    @Override
    public void printName() {
        System.out.println(directoryName);
        directoryComponents.forEach(Component::printName);
    }

    @Override
    public void add(Component component) {
        directoryComponents.add(component);
    }

    @Override
    public Component get(int i) {
        return directoryComponents.get(i);
    }


}
