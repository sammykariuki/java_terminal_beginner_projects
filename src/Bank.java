import java.util.Scanner;

public class Bank {

    static double balance = 0;
    public static void runBank(Scanner scanner) {
        //declare variables

        int choice;
        boolean isRunning = true;


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

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> deposit(scanner);
                case 3 -> withdraw(scanner);
                case 4 -> {
                    System.out.println("******************");
                    System.out.println("Thank You. GOODBYE");
                    System.out.println("******************");
                    isRunning = false;
                }
                default -> {
                    System.out.println("--------------");
                    System.out.println("Invalid Choice");
                    System.out.println("--------------");
                }

            }
        } while(isRunning);

    }
    static void showBalance(double balance) {
        System.out.println("----------------------");
        System.out.printf("Account balance: $%.2f\n", balance);
        System.out.println("----------------------");
    }
    static void deposit(Scanner scanner){
        double amount;
        boolean validAmount = false;
        do {
            System.out.print("Enter amount to deposit: ");
            amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("--------------------------");
                System.out.println("Amount cannot be 0 or less");
                System.out.println("--------------------------");
            }
            else{
                validAmount = true;
                balance += amount;
                System.out.println("----------------------------");
                System.out.printf("Successfully deposited $%.2f\n", amount);
                System.out.println("----------------------------");
            }
        } while (!validAmount);
    }
    static void withdraw(Scanner scanner) {
        double amount;
        boolean validAmount = false;
        do {
            System.out.print("Enter amount to withdraw: ");
            amount = scanner.nextDouble();

            if (amount <= 0) {
                System.out.println("-----------------------------");
                System.out.println("You cannot withdraw 0 or less");
                System.out.println("-----------------------------");
            } else if (amount > balance) {
                System.out.println("------------------");
                System.out.println("Insufficient funds");
                System.out.println("------------------");
                break;
            } else {
                balance -= amount;
                System.out.println("-----------------------------");
                System.out.printf("Successfully withdrawn: $%.2f\n", amount);
                System.out.println("-----------------------------");
                validAmount = true;
            }
        } while(!validAmount);
    }
}
