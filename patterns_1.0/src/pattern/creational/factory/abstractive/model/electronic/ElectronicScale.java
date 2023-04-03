package pattern.creational.factory.abstractive.model.electronic;

import pattern.creational.factory.abstractive.model.Scale;

public class ElectronicScale implements Scale {
    @Override
    public void showWeight(int weight) {
        System.out.println("ElectronicScale shows weight " + weight);
    }
}
