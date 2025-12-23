package Polymorphism.Compiletimepolymorphism;

public class Test {
    public static void main(String[] args) {

        A a = new B();
        a.add(2); // A method will be called because in overloading compiler checks for the reference.
    }
}
