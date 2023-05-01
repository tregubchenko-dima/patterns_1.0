package pattern.behavior.templatemethod;

import java.util.Arrays;

public class BlueBerryTeaMaker extends TeaMakerBase{
    @Override
    protected int addWaterAmount() {
        return 200;
    }

    @Override
    protected int addSugarAmount() {
        return 2;
    }

    @Override
    protected boolean isLemonAdded() {
        return false;
    }

    @Override
    protected boolean isCold() {
        return false;
    }

    @Override
    protected String[] addBerries() {
        return new String[]{"Blueberry"};
    }
}
