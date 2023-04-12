package pattern.structural.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    void showShape() {
        System.out.print("Rectangle's color: ");
        color.show();
    }
}
