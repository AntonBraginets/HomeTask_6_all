package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data Ivanov = new Data(700, 100);
        System.out.println("Initial debt: " + Ivanov.getInitialDebt());
        System.out.println("Min monthly payment: " + Ivanov.getMonthlyPaymentBasic());
        System.out.println();

        while (Ivanov.getCurrentDebt() > 0) {
            System.out.print("Please enter amount of payment: ");
            double monthlyPaymentActual = new Scanner(System.in).nextDouble();
            if (monthlyPaymentActual < Ivanov.getMonthlyPaymentBasic()) {
                System.out.println("Your amount is unacceptable. It is below min monthly payment of " + Ivanov.getMonthlyPaymentBasic());
            } else {
                Ivanov.setMonthlyPaymentActual(monthlyPaymentActual);
                Ivanov.setCurrentDebt(Ivanov.getCurrentDebt() - monthlyPaymentActual);
                if (Ivanov.getCurrentDebt() < 0)
                    System.out.println("Debt is reimbursed in full. Mr.Ivanov has paid excessive amount of: " + Ivanov.getCurrentDebt());
                else
                    System.out.println("Current debt of Mr.Ivanov is: " + Ivanov.getCurrentDebt());
            }
        }
    }
}