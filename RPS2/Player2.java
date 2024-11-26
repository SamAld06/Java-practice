package RPS2;
import java.util.Scanner;

public class Player2 {
    public static String choice2;
    public static int wins = 0;
    public static void main (String[] args) {
        while (choice2 == null) {
            Scanner myChoice = new Scanner(System.in);
            System.out.println("Player 2 please enter your choice: ");
            choice2 = myChoice.nextLine();
            if (choice2.equalsIgnoreCase("Rock")) {
                choice2 = Rock.main(args);
            }else if (choice2.equalsIgnoreCase("Paper")) {
                choice2 = Paper.main(args);
            }else if (choice2.equalsIgnoreCase("Scissors")) {
                choice2 = Scissors.main(args);
            }else if (choice2.equalsIgnoreCase("end")) {
                choice2 = "End";
            }else {
                choice2 = null;
            }
        }
    }
    public static String getChoice() {
        return choice2;
    }
}