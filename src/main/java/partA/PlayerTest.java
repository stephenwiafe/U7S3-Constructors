package partA;

public class PlayerTest {
    public static String Player() {
        String response = "";

        /**
         * Your code goes here
         */
        Player player1 = new Player("Curry",6.2,13);
        response = player1.name + "\n" + player1.height + "\n" + player1.yearsInLeague;

        return response;
    }

    public static void main(String[] args) {
        String playerOutput = Player();
        System.out.print(playerOutput);
    }
}
