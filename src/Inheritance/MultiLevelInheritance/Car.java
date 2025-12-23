package Inheritance.MultiLevelInheritance;

public class Car extends FourWheelerVehicle{

    Car(){
        super();
        System.out.println("Car constructor");
    }

    @Override
    public void start(){
        System.out.println("Car starting......");
    }
}
