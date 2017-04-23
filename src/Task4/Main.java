package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data arrayOper = new Data();
        System.out.print("Please enter quantity of array elements: ");
        int N = new Scanner(System.in).nextInt();
        arrayOper.setN(N);
        arrayOper.arrayCreation();
        arrayOper.bubbleSort();
        arrayOper.resultPrint();
    }
}
