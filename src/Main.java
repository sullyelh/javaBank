import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bankAccount obj1 = new bankAccount("Sully", "ABC123");
        obj1.showMenu();
    }
}

class bankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    bankAccount(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposit (int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw (int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrew: " + previousTransaction);
        }
        else {
            System.out.println("No transactions on record.");
        }
    }

    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println();
        System.out.println("A: Check Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transaction");
        System.out.println("E: Exit");

        do {
            System.out.println("===============================================================");
            System.out.println("Enter an option");
            System.out.println("===============================================================");
            option = scanner.next().charAt(0);

            switch(option) {
                case 'A':
                    System.out.println("===============================================================");
                    System.out.println("Your balance is: " + balance);
                    System.out.println("===============================================================");
                    break;

                case 'B':
                    System.out.println("===============================================================");
                    System.out.println("Enter an amount to deposit.");
                    System.out.println("===============================================================");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    break;

                case 'C':
                    System.out.println("===============================================================");
                    System.out.println("Enter an amount to withdraw.");
                    System.out.println("===============================================================");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    break;

                case 'D':
                    System.out.println("===============================================================");
                    getPreviousTransaction();
                    System.out.println("===============================================================");
                    break;

                case 'E':
                    System.out.println("***************************************************************");

                default:
                    System.out.println("Please enter a valid option.");
                    break;

            }
        }
        while (option != 'E');
            System.out.println("Thank You!");
    }
}