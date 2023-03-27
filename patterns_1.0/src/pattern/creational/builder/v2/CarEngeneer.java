package pattern.creational.builder.v2;

public class CarEngeneer {

    private CarBuilder carBuilder;

    public CarEngeneer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar(){
        return carBuilder.addColor().addName().addSpeed().build();
    }
}
