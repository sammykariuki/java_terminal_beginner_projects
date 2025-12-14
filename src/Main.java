import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char program;

        System.out.println("********");
        System.out.println("Hello👋");
        System.out.println("********");
        do {
        System.out.println("Welcome to this Java Demonstration");
        System.out.println("1. Banking Application");
        System.out.println("2. Dice Roller Application");
        System.out.print("Select a program to run (q to quit): ");
        program = scanner.next().toLowerCase().charAt(0);
        switch (program) {
            case '1' -> Bank.runBank();
            case '2' -> Dice.rollDice();
            case 'q' -> System.out.println("Good bye👋");
            default -> {
                System.out.println("--------------");
                System.out.println("Invalid input");
                System.out.println("--------------");
            }

        }

        } while (program != 'q');
        scanner.close();
    }
}
