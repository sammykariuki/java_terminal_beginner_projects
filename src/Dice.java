import java.util.Scanner;
import java.util.Random;
public class Dice {

    public static void rollDice(Scanner scanner) {

        Random random = new Random();
        int dice = 0;
        int total = 0;
        char controller = 'a';


        System.out.println("******************************************");
        System.out.println("Welcome to the Java Dice Roller Programme🎲");
        System.out.println("******************************************");

        do {
            while (dice < 1 || dice > 4){
                System.out.println("Reset this by quitting program");
                System.out.print("How many dice do you want to roll? (1-4): ");
                dice = scanner.nextInt();

                if(dice < 1 || dice > 4) {
                    System.out.println("-------------");
                    System.out.println("Invalid input");
                    System.out.println("-------------");
                }
            }
            int[] rolls = new int[dice];

            for (int i = 0; i < dice; i++){
                rolls[i] = random.nextInt(1, 7);
            }
            for (int roll : rolls){
                showDice(roll);
                total += roll;
                System.out.println("You rolled " + roll);
            }
            System.out.println("*********");
            System.out.println("Total: " + total);
            System.out.println("*********");

            total = 0;

            //if I wanted to have to select number of dice to roll each round
            //dice = 0;
            System.out.println("(Reset number of dice by quiting program)");
            System.out.print("Enter any character to continue (q to quit): ");
            controller = scanner.next().toLowerCase().charAt(0);


        } while (controller != 'q');
        System.out.println("*******************************");
        System.out.println("Thank you for rolling with us👋");
        System.out.println("*******************************");
    }
    static void showDice(int roll) {
        switch(roll) {
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
