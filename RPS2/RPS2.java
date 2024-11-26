package RPS2;

public class RPS2 {
    public static void main(String[] args) {
        int play = 1;
        while (play == 1) {
            System.out.println("If you wish to stop the game enter 'end' or 'End'");
            Player1.main(args);
            Player2.main(args);
            String choice1 = Player1.getChoice();
            String choice2 = Player2.getChoice();
            if (choice1.equals("Rock") && choice2.equals("Scissors")) {
                System.out.println("Player 1 wins!");
                Player1.wins += 1;
            }else if (choice1.equals("Paper") && choice2.equals("Rock")) {
                System.out.println("Player 1 wins!");
                Player1.wins += 1;
            }else if (choice1.equals("Scissors") && choice2.equals("Paper")) {
                System.out.println("Player 1 wins!");
                Player1.wins += 1;
            }else if (choice1.equalsIgnoreCase("End") || choice2.equalsIgnoreCase("End")) {
                play = 0;
                System.out.println("Player 1 won : " + Player1.wins + " times!");
                System.out.println("Player 1 won : " + Player2.wins + " times!");
                System.out.println("Scissors was chosen: " + Scissors.chosen + " times!");
                System.out.println("Rock was chosen: " + Rock.chosen + " times!");
                System.out.println("Paper was chosen: " + Paper.chosen + " times!");
            }else if (choice1.equals(choice2)) {
                System.out.println("Its a tie!");
            }else {
                System.out.println("Player 2 wins!");
                Player2.wins += 1;
            }
            System.out.println("Player 1 chose: " + choice1);
            System.out.println("Player 2 chose: " + choice2);
            Player1.choice1 = null;
            Player2.choice2 = null;
        }
    }
}
