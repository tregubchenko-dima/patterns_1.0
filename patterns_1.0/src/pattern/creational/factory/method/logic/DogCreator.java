package pattern.creational.factory.method.logic;

import pattern.creational.factory.method.model.Animal;
import pattern.creational.factory.method.model.Dog;

public class DogCreator implements AnimalCreator{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
