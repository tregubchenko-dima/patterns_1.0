package pattern.behavior.templatemethod;

public class StrawBerryTeaMaker extends TeaMakerBase{
    @Override
    protected int addWaterAmount() {
        return 300;
    }

    @Override
    protected int addSugarAmount() {
        return 3;
    }

    @Override
    protected boolean isLemonAdded() {
        return true;
    }

    @Override
    protected boolean isCold() {
        return false;
    }

    @Override
    protected String[] addBerries() {
        return new String[]{"Strawberry"};
    }
}
