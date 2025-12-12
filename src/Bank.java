import java.util.Scanner;

public class Bank {
    public static void runBank() {
        //declare variables
        double balance = 0;
        int choice;
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        //welcome message
        System.out.println("***********************************");
        System.out.println("Welcome to the Java Banking Program");
        System.out.println("***********************************");
        //display options
        do{
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Select option (1-4): ");
            choice = scanner.nextInt();

            if(choice < 1 || choice > 4) {
                System.out.println("Invalid Choice");
            }
            if (choice == 4) {
                System.out.println("Thank You. GOODBYE");
                isRunning = false;
            }
        } while(isRunning);

        //  showBalance
        //  deposit
        //  withdraw
        //  exit
        //exit message

        scanner.close();

    }
}
