package pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {

    private List<Component> directories = new ArrayList<>();

    public FileSystem(List<Component> directories) {
        this.directories = directories;
    }

    public void showFileSystem() {
        directories.forEach(Component::printName);
    }
}
