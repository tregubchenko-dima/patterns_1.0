package pattern.structural.adapter;

public class DogAdapter implements Lion{

    private final Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void roar(String msg) {
        dog.gav(msg);
    }
}
