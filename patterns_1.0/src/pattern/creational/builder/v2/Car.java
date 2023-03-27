package pattern.creational.builder.v2;

public class Car {

    private int speed;
    private String name;
    private String color;

    public Car(int speed, String name, String color) {
        this.speed = speed;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
