package Inheritance.MultiLevelInheritance;

public class Test {
    public static void main(String[] args) {

        FourWheelerVehicle fourWheelerVehicle = new FourWheelerVehicle();
        System.out.println(fourWheelerVehicle.name);

        fourWheelerVehicle.start();
        fourWheelerVehicle.engineCapacity();

        Car c = new Car();
        c.start();

    }
}
