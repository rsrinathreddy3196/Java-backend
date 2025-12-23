package Inheritance.MutltipleInheritance;

public class Car extends FourWheeler implements Vehicle {

    public void start(){
        System.out.println("Car start");
    }

    public void stop(){
        System.out.println("Car stop");
    }
}
