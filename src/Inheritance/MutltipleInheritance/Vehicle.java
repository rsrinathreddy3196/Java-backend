package Inheritance.MutltipleInheritance;

public interface Vehicle {

    String name ="vehicle";
    void start();
    void stop();

    default void Engine(){
        System.out.println("I am vehicle engine");
    }

}
