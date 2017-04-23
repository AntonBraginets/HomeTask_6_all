package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data Numbers = new Data();
        System.out.print("Please enter number for analysis: ");
        int number = new Scanner(System.in).nextInt();
        Numbers.setNumber(number);
        System.out.println("1) " + Numbers.PositiveNegative());
        System.out.println("2) " + Numbers.Prime());
        System.out.println("3) " + Numbers.Division());
    }
}