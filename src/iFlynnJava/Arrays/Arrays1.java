package iFlynnJava.Arrays;


import java.util.Arrays;
import java.util.Random;

public class Arrays1 {
    public static void main(String[] args) {
        // arrTask1();
        // arrTask2();
        // arrTask3();
        // arrTask4();
        // arrTask5();
        // arrTask6();
        // arrTask7();
        // arrTask8();
        arrTask9();

    }

    public static void arrTask1() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + arr[i] + "]");
        }
    }

    public static void arrTask2() {
        int[] arr = new int[]{14, 56, 61, -54, -5, 98, 106};
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]");
        }
    }

    public static void arrTask3() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = i + 2;
            System.out.print("[" + arr[i] + "]");
        }
    }

    public static void arrTask4() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print("[" + arr[i] + "]");
        }
    }

    public static void arrTask5() {
        Random in = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(10);
            System.out.print("[" + arr[i] + "]");
        }
    }

    public static void arrTask6() {
        int[] arr = new int[40];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = i + 2;
            System.out.print("|" + arr[i] + "|");
            sum = sum + arr[i];
            avg = sum / arr[i];
        }
        System.out.println();
        System.out.println("Сумма" + sum);
        System.out.println("Средн. ариф" + avg);
    }

    public static void arrTask7() {
        Random in = new Random();
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(10);
            System.out.print("[" + arr[i] + "]");
            if (i % 2 == 0) {
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));
    }

    public static void arrTask8() {
        Random in = new Random();
        int[] arr = new int[15];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(9);
            System.out.print("[" + arr[i] + "]");
            if (arr[i] % 2 == 0) {
                sum++;
            }
        }
        System.out.println();
        System.out.println("Кол-во четных элементов:" + sum);
    }

    public static void arrTask9() {
        Random in = new Random();
        int[] arr = new int[]{23, 34, 35, 40};
       /* for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(99 - 10) + 10;
            System.out.print("[" + arr[i] + "]");
        }*/
        boolean sorted = false;
        // while (!sorted) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] < arr[j + 1]) {
                    System.out.println("возрастает");

                } else {
                    sorted = true;
                    System.out.println("Не Возрастает");
                    break;
                }
            }
        //}

    }
}
