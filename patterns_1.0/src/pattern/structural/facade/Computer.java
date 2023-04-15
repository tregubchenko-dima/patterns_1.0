package pattern.structural.facade;

public class Computer {

    public void getElectricShock(){
        System.out.println("Ouch!");
    }

    public void makeSound(){
        System.out.println("Beep beep!");
    }

    public void showLoadingScreen() {
        System.out.println("Loading...");
    }

    public void bam() {
        System.out.println("Ready!");
    }

    public void closeEverything() {
        System.out.println("Bup bup bup buzzz");
    }

    public void sooth() {
        System.out.println("Zzzzz");
    }
}
