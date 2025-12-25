package Inheritance.MutltipleInheritance;

public class Test {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        System.out.println(Vehicle.name);

        FourWheeler fw = new Car();
        fw.start();

        Vehicle v1 = new Car();
        v.Engine();

        Vehicle.gear();

    }
}
