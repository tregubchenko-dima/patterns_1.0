package pattern.behavior.templatemethod;

public abstract class TeaMakerBase {

    public Tea makeTea() {
        Tea tea = new Tea();
        tea.setWaterAmount(addWaterAmount());
        tea.setSugarAmount(addSugarAmount());
        tea.setLemonAdded(isLemonAdded());
        tea.setCold(isCold());
        tea.setBerries(addBerries());
        return tea;
    }

    protected abstract int addWaterAmount();
    protected abstract int addSugarAmount();
    protected abstract boolean isLemonAdded();
    protected abstract boolean isCold();
    protected abstract String[] addBerries();
}
