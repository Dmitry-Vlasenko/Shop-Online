package app.view;

import java.util.Locale;
import java.util.Scanner;

public class AppView {

    private final Scanner scanner = new Scanner(System.in);

    public String[] getData() {
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter buyer name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter buyer phone: ");
        String phone = scanner.nextLine().trim();
        System.out.print("Enter product count: ");
        String quantity = scanner.nextLine().trim();
        System.out.print("Enter product price, USD: ");
        String price = scanner.nextLine().trim();
        System.out.println("Deliver product? + or -");
        String typeShopping = scanner.nextLine().trim();
        String address = "";
        if (typeShopping.equals("+")) {
            System.out.println("Address for delivered?: ");
            address = scanner.nextLine().trim();
        }
        scanner.close();

        return new String[]{name, phone, quantity, price, typeShopping, address};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
