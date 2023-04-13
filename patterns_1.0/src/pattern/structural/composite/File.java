package pattern.structural.composite;

public class File implements Component{

    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void printName() {
        System.out.println(fileName);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Component get(int i) {
        throw new UnsupportedOperationException();
    }
}
