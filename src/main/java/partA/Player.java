package partA;

public class Player {

    //Fields
    public String name;
    public double height;
    public int yearsInLeague;

    //Constructor
    public Player(String name, double height, int yearsInLeague) {
        this.name = name;
        this.height = height;
        this.yearsInLeague = yearsInLeague;
    }


    //Methods
    public void think(){
        System.out.println("I'll have my win.");
    }
}
