package pattern.behavior.templatemethod;

import java.util.Arrays;

public class Tea {

    private int waterAmount;
    private int sugarAmount;
    private boolean isLemonAdded;
    private boolean isCold;
    private String[] berries;

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }

    public void setSugarAmount(int sugarAmount) {
        this.sugarAmount = sugarAmount;
    }

    public boolean isLemonAdded() {
        return isLemonAdded;
    }

    public void setLemonAdded(boolean lemonAdded) {
        isLemonAdded = lemonAdded;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    public String[] getBerries() {
        return berries;
    }

    public void setBerries(String[] berries) {
        this.berries = berries;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "waterAmount=" + waterAmount +
                ", sugarAmount=" + sugarAmount +
                ", isLemonAdded=" + isLemonAdded +
                ", isCold=" + isCold +
                ", berries=" + Arrays.toString(berries) +
                '}';
    }
}
