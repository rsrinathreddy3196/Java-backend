package Inheritance.MultiLevelInheritance;

public class FourWheelerVehicle extends Vehicle{

    FourWheelerVehicle(){
        System.out.println("FourWheelerVehicle constructor");
    }

    String name ="Car";
    @Override
    public void start(){
        System.out.println("FourWheelerVehicle starting...");
    }

    public void engineCapacity(){
        System.out.println("engine capacity");
    }
}
