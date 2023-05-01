package pattern.behavior.templatemethod;

public class TemplateMethodTest {

    public static void main(String[] args){
        TeaMakerBase bteaMaker = new BlueBerryTeaMaker();
        TeaMakerBase steaMaker = new StrawBerryTeaMaker();

        Tea blueberryTea = bteaMaker.makeTea();
        Tea strawberryTea = steaMaker.makeTea();

        System.out.println(blueberryTea);
        System.out.println(strawberryTea);
    }
}
