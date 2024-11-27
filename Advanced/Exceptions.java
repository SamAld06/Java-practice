package Advanced;
import java.util.Scanner;

public class Exceptions {
    public static int number;
    public static void main(String[] args) {
        handleException(args);
    }
    public static void handleException(String[] args) {
        Scanner myChoice = null;
        try {
            myChoice = new Scanner(System.in);
            System.out.println("Enter a number");
            number = Integer.parseInt(myChoice.nextLine());
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[number]);
        } catch (NumberFormatException e) {
            System.out.println("Something went wrong: ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input out of array bounds");
        } catch (Exception e) {
            System.out.println("Please enter a number: ");
        } finally {
            if (myChoice != null) {
                myChoice.close();
                System.out.println("Scanner closed");
                
            }
        }
    }
}
