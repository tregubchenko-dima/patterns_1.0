package pattern.creational.factory.abstractive.model.mechanical;

import pattern.creational.factory.abstractive.model.Scale;

public class MechanicalScale implements Scale {
    @Override
    public void showWeight(int weight) {
        System.out.println("MechanicalScale shows weight " + weight);
    }
}
