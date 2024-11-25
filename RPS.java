import java.lang.Math;
// 1 = rock
// 2 = paper
// 3 = scissors
public class RPS{
    public static void main(String[] args) {
        int max = 3;
        int min = 1;
        int range = max - min + 1;
        int player1 = (int)(Math.random() * range) + min;
        int player2 = (int)(Math.random() * range) + min;
        System.out.println(player1);
        System.out.println(player2);
        if (player1 == player2) {
            System.out.println("Its a tie!");
        }else if (player1 == 1 && player2 == 3) {
            System.out.println("Player 1 wins!");
        }else if (player1 == 2 && player2 == 1) {
            System.out.println("Player 1 wins!");
        }else if (player1 == 3 && player2 == 2) {
            System.out.println("Player 1 wins!");
        }else {
            System.out.println("Player 2 wins!");
        }
    }
}
