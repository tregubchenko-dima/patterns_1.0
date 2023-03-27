package pattern.creational.builder.v2;

public class TrackCarBuilder implements CarBuilder{

    private int speed;
    private String name;
    private String color;

    @Override
    public CarBuilder addName() {
        this.name = "TrackCar";
        return this;
    }

    @Override
    public CarBuilder addSpeed() {
        this.speed = 120;
        return this;
    }

    @Override
    public CarBuilder addColor() {
        this.color = "Green";
        return this;
    }

    @Override
    public Car build() {
        return new Car(speed, name, color);
    }
}
