package Abstraction;

public class Test {

    public static void main(String[] args) {

        Mobile m = new Samsung();
        m.start();
        m.powerOff();
        System.out.println("Switched off");

        Mobile m1 = new Redmi();
        m1.powerOff();

        m1.powerOn();
    }
}
