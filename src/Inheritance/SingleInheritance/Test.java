package Inheritance.SingleInheritance;

public class Test {
    public static void main(String[] args) {

        Cricket t20Cricket = new Cricket();

        t20Cricket.play();

        t20Cricket.name = "Ind vs Aus";
        t20Cricket.noOfPlayers =11;
        t20Cricket.venue ="Eden gardens";
        t20Cricket.pitchCondition = "Dry";

        System.out.println(t20Cricket.name);
        System.out.println(t20Cricket.noOfPlayers);
        System.out.println(t20Cricket.venue);
        System.out.println(t20Cricket.pitchCondition);

        t20Cricket.play();
        float strikeRate = t20Cricket.calculateStrikeRate(250,100);
        System.out.println("Player strike rate :" + strikeRate);
    }
}
