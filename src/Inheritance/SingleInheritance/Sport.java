package Inheritance.SingleInheritance;

public class Sport {

    String name;
    int noOfPlayers;

    Sport(){
        System.out.println("constructor of parent");
    }


    public void play(){
        System.out.println("parent play method");
    }

    public void stop(){
        System.out.println("stop the game");
    }
}

class Cricket extends Sport{

    String venue;

    String pitchCondition;

    Cricket(){
        System.out.println("constructor of child");
    }

    public float calculateStrikeRate(int runs, int balls){
        float strikeRate;

        strikeRate = (float) (runs/balls)*100;

        return strikeRate;
    }

    public void play(){
        System.out.println("child play method");
    }

}
