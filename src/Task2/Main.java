package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data forEX = new Data();
        System.out.print("Please enter exchange rate: ");
        double rate = new Scanner(System.in).nextDouble();
        forEX.setRate(rate);
        System.out.print("Please enter initial currency amount: ");
        double initialCurrency = new Scanner(System.in).nextDouble();
        forEX.setInitialCurrency(initialCurrency);
        System.out.println("You will get: " + forEX.getFinalCurrency());
    }
}
