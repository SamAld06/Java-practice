package MiniProjects.TodoProject;

import java.util.Scanner;

public class TaskList {
    public static String choice;
    public static void main(String [] args) {

    }

    public static void option() {
        while (choice == null) {
            Scanner myChoice = new Scanner(System.in);
            System.out.print("A: Add task | B: Delete task | C: Update task | End: Stop program");
            System.out.println("Please choose options between options A, B, C, D or End");
            choice = myChoice.nextLine();
            if (choice.equalsIgnoreCase("A")) {
                AddTask.main();
            }else if (choice.equalsIgnoreCase("B")) {
                DeleteTask.main();
            }else if (choice.equalsIgnoreCase("C")) {
                UpdateTask.main();
            }else if (choice.equalsIgnoreCase("D")) {
                ViewTask.main(String[]);
            }else if (choice.equalsIgnoreCase("End")) {
                choice = "End";
            }else {
                choice = null;
            }
        }
    }
}
