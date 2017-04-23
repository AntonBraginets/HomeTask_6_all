package Task5;

import java.util.Scanner;
import java.util.Random;

class Data {
    private int N = 0;
    private int num = 0;
    private boolean result = false;
    public int array[] = new int[N]; //нужно определять все до методов!
    public double arrayD[] = new double[N];
    private int choice = 0;

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setN(int N) {
        this.N = N;
        array = new int[N];
    }

    public void setND(int N) {
        this.N = N;
        arrayD = new double[N];
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void arrayCreation(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(10);
        }
    }

    public void arrayCreation(double arrayD[]) {
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = new Random().nextInt(10);
        }
    }

    public void arrayPrint(int array[]) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public void arrayPrint(double arrayD[]) {
        for (double a : arrayD) {
            System.out.print(a + "  ");
        }
    }

    public boolean checker() {
        switch (choice) {
            case 1: {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == num) {
                        result = true;
                        break;
                    } else result = false;
                }
                return result;
            }
            case 2: {
                for (int j = 0; j < arrayD.length; j++) {
                    if (arrayD[j] == (double) num) {
                        result = true;
                        break;
                    } else result = false;
                }
            }
        }
        return result;
    }
}