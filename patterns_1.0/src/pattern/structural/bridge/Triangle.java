package pattern.structural.bridge;

public class Triangle extends Shape{

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    void showShape() {
        System.out.print("triangle's color: ");
        color.show();
    }
}
