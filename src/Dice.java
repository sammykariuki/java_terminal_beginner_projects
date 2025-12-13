import java.util.Scanner;
import java.util.Random;
public class Dice {

    public static void rollDice() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int dice = 0;

        System.out.println("*****************************************");
        System.out.println("Welcome to the Java Dice Roller Programme");
        System.out.println("*****************************************");

        //user input no of dice
        while (dice < 1 || dice > 4){
            System.out.print("How many dice do you want to roll? (1-4): ");
            dice = scanner.nextInt();
            if(dice < 1 || dice > 4) {
                System.out.println("-------------");
                System.out.println("Invalid input");
                System.out.println("-------------");
            }
        }
        //output
    }
    static void showDice() {
        switch() {
            case 1 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |           |
                    |     ●     |
                    |           |
                    |           |
                      _ _ _ _ _
                    """);
            case 2 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |  ●        |
                    |           |
                    |        ●  |
                    |           |
                      _ _ _ _ _
                    """);
            case 3 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |  ●        |
                    |     ●     |
                    |        ●  |
                    |           |
                      _ _ _ _ _
                    """);
            case 4 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |  ●     ●  |
                    |           |
                    |  ●     ●  |
                    |           |
                      _ _ _ _ _
                    """);
            case 5 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |  ●     ●  |
                    |     ●     |
                    |  ●     ●  |
                    |           |
                      _ _ _ _ _
                    """);
            case 6 -> System.out.println("""
                      _ _ _ _ _
                    |           |
                    |  ●     ●  |
                    |  ●     ●  |
                    |  ●     ●  |
                    |           |
                      _ _ _ _ _
                    """);
            default -> System.out.println("Invalid roll");
        }
    }
}
