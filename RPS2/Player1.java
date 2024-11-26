package RPS2;
import java.util.Scanner;

public class Player1 {
    public static String choice1;
    public static int wins = 0;
    public static void main (String[] args) {
        while (choice1 == null) {
            Scanner myChoice = new Scanner(System.in);
            System.out.println("Player 1 please enter your choice: ");
            choice1 = myChoice.nextLine();
            if (choice1.equalsIgnoreCase("Rock")) {
                choice1 = Rock.main(args);
            }else if (choice1.equalsIgnoreCase("Paper")) {
                choice1 = Paper.main(args);
            }else if (choice1.equalsIgnoreCase("Scissors")) {
                choice1 = Scissors.main(args);
            }else if (choice1.equalsIgnoreCase("end")) {
                choice1 = "End";
            }else {
                choice1 = null;
            }
        }
    }
    public static String getChoice() {
        return choice1;
    }
}
