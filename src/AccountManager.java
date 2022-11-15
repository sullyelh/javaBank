import java.util.Scanner;

public class AccountManager {
    Scanner createAccScan = new Scanner(System.in);
    Scanner createPinScan = new Scanner(System.in);

    String accountCreateSuccessMessage = "Successfully created Account";

    public String createAccount() {
        bankAccount a = new bankAccount(createAccScan, createPinScan);
        System.out.println("Enter your Account Name: ");
        a.customerName = createAccScan.next();
        System.out.println("Enter your Account Pin: ");
        a.customerPin = createPinScan.nextInt();
        return a.showMenu();
    }
}
