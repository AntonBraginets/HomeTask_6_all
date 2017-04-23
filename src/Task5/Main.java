package Task5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Data numbers = new Data();
        System.out.print("Please enter number of array elements: ");
        int N = new Scanner(System.in).nextInt();
        numbers.setN(N);
        numbers.setND(N);
        System.out.print("Please enter number which will be searched among array elements: ");
        int num = new Scanner(System.in).nextInt();
        numbers.setNum(num);
        System.out.print("Please choose type of data INT (1) or DOUBLE (2): ");
        int choice = new Scanner(System.in).nextInt();
        numbers.setChoice(choice);
        switch (choice) {
            case 1: {
                System.out.println();
                System.out.println("Initial array:");
                numbers.arrayCreation(numbers.array);
                numbers.arrayPrint(numbers.array);
                System.out.print("\nEntered number is in this array: " + numbers.checker());
                break;
            }
            case 2: {
                System.out.println();
                System.out.println("Initial array:");
                numbers.arrayCreation(numbers.arrayD);
                numbers.arrayPrint(numbers.arrayD);
                System.out.print("\nEntered number is in this array: " + numbers.checker());
                break;
            }
            default: {
                System.out.println("Option №" + choice + " is unavailable yet.");
                break;
            }
        }
    }
}
