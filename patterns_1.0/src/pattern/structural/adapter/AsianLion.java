package pattern.structural.adapter;

public class AsianLion implements Lion {

    @Override
    public void roar(String msg) {
        System.out.println(msg + "(said asian)");
    }
}
