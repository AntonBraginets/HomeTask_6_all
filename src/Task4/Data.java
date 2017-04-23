package Task4;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Arrays;

class Data {
    private int N = 1;
    private int temp = 0;
    private boolean flag = true;
    int array[] = new int[N];

    public void setN(int N) {
        this.N = N;
        array = new int[N];
    }

    public void arrayCreation() {
        System.out.println("Initial array is:");
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100) - 50;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        System.out.println("New array is: ");
        while (flag) {
            flag = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public void resultPrint() {
        for (int a : array)
            System.out.print(a + " ");
    }
}