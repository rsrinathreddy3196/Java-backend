package Polymorphism.Compiletimepolymorphism;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int add (int a , int b, int c){
        return a+b+c;
    }

    public double add (int a, double b){
        return a+b;
    }

    public double add (double b, int a){
        return b +a;
    }
}
