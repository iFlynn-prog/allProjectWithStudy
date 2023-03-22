package iFlynnJava.BubbleSort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        bubblesort();
    }

    public static void bubblesort() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.println(Arrays.toString(arr));
        }
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
                System.out.print("=" + arr[i] + "=");
                System.out.print(sorted);
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
