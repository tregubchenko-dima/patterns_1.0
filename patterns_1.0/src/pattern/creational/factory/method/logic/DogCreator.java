package pattern.creational.factory.method.logic;

import pattern.creational.factory.method.model.Dog;

public class DogCreator implements AnimalCreator<Dog>{
    @Override
    public Dog createAnimal() {
        return new Dog();
    }
}
