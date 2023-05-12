import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String name = "Eduardo Aguliari";
        String accountType = "Checking";
        double balance = 2500;
        int option;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("\n** Operations **");
            System.out.println("1 - Check data and balance");
            System.out.println("2 - Receive amount");
            System.out.println("3 - Transfer amount");
            System.out.println("4 - Exit");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println("-------------------------");
                System.out.println("Name: " + name);
                System.out.println("Account type: " + accountType);
                System.out.println("Balance: $" + balance);
                System.out.println("-------------------------");
            } else if (option == 2) {
                double value;
                System.out.println("Enter the amount you will receive: $");
                value = sc.nextDouble();
                balance += value;
                System.out.println("Updated balance: $" + balance);
            } else if (option == 3) {
                double value;
                System.out.println("Enter the amount to be transferred: $");
                value = sc.nextDouble();
                if (value > balance) {
                    System.out.println("There is not enough balance to make this transfer.");
                } else {
                    balance -= value;
                }
                System.out.println("Updated balance: $" + balance);
            }
        } while (option != 4);
        System.out.println("Program terminated.");
    }
}