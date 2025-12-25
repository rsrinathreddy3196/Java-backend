package Abstraction;

public abstract class Mobile {

    Mobile(){
        System.out.println("I am mobile constructor");
    }
    public String size;
    public void start(){
        System.out.println(" iam the method without abstract");
    }

    abstract void powerOff();

    public abstract void powerOn();
}
