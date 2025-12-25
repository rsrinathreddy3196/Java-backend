package Static;

public class Test {

    public static void main(String[] args) {

        Human.name ="honey";

        System.out.println(Human.name);
        Human.walk();

        Human h = new Human();
        h.sleep();
    }
}
