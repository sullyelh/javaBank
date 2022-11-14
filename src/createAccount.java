import java.util.Scanner;

public class createAccount {

    public static Scanner scan = new Scanner(System.in);

    static void identifier() {
        System.out.println("****************************************************************************");
        System.out.println("Please enter your name: ");
        String customerName = scan.nextLine();
        System.out.println("****************************************************************************");
    }

   static void makePin() {
        System.out.println("****************************************************************************");
        System.out.println("Please enter a Pin for your account: ");
        int customerPin = scan.nextInt();
        System.out.println("****************************************************************************");

    }

}
