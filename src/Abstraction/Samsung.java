package Abstraction;

public class Samsung extends Mobile {
    @Override
    void powerOff() {
        System.out.println("Long press power button");
    }

    @Override
    public void powerOn() {
        System.out.println("Long press power button");
    }
}
