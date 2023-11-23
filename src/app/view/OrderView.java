package app.view;

import app.until.Constants;

import java.util.Scanner;

public class OrderView {
    public String[] getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Input customer phone: ");
        String customerPhone = scanner.nextLine();
        System.out.print("Input customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.print("Input product name: ");
        String productName = scanner.nextLine();
        System.out.print("Input product quota: " + Constants.MSR_PCS + ": ");
        String quota = scanner.nextLine();
        System.out.print("Input product price: " + Constants.CURRENCY + ": ");
        String price = scanner.nextLine();
        System.out.print("Input delivery needed? Input Y/N: ");
        String delivery = scanner.nextLine();

        return new String[]{customerName, customerPhone, customerAddress, productName, quota, price, delivery};

    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
