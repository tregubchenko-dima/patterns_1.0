package pattern.creational.factory.abstractive.model.mechanical;

import pattern.creational.factory.abstractive.model.Watch;

public class MechanicalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("MechanicalWatch shows weight");
    }
}
