package pattern.structural.adapter;

public class AfricanLion implements Lion{
    @Override
    public void roar(String msg) {
        System.out.println(msg + "said african");
    }
}
