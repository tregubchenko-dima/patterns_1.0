package pattern.structural.adapter;


public class TestAdapter {

    public static void main(String[] args){
        Dog dog = new WildDog();
        DogAdapter dogAdapter = new DogAdapter(dog);

        dogAdapter.roar("I'm a dog, but i wanna be a lion");
    }
}
