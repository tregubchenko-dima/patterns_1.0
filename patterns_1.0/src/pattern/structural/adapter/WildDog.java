package pattern.structural.adapter;

public class WildDog implements Dog{
    @Override
    public void gav(String msg) {
        System.out.println(msg + " (said wild)");
    }
}
