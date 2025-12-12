import java.util.Scanner;

public class Bank {
    public static void runBank() {
        //declare variables
        double balance = 0;
        int choice;
        Scanner scanner = new Scanner(System.in);

        //welcome message
        System.out.println("***********************************");
        System.out.println("Welcome to the Java Banking Program");
        System.out.println("***********************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Show Balance");
        System.out.println("3. Show Balance");
        System.out.println("4. Show Balance");
        //display options
        System.out.print("Select option (1-4): ");
        choice = scanner.nextInt();
        //  showBalance
        //  deposit
        //  withdraw
        //  exit
        //exit message

        scanner.close();

    }
}
