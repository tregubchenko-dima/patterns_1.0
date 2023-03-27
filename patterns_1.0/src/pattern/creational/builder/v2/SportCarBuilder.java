package pattern.creational.builder.v2;

public class SportCarBuilder implements CarBuilder{

    private int speed;
    private String name;
    private String color;

    @Override
    public CarBuilder addName() {
        this.name = "SportCar";
        return this;
    }

    @Override
    public CarBuilder addSpeed() {
        this.speed = 300;
        return this;
    }

    @Override
    public CarBuilder addColor() {
        this.color = "black";
        return this;
    }

    @Override
    public Car build() {
        return new Car(speed, name, color);
    }
}
