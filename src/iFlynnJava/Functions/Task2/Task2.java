package iFlynnJava.Functions.Task2;
import java.util.Random;
/*
 * Создайте функцию, которая принимает на вход два числа (начальное и конечное),
 * и выдает рандомное число между этими границами.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Рандомное число:" + sum_random(2, 4));
    }
    public static int sum_random(int start, int end) {
        Random random = new Random();
        int randomNum;
        randomNum = random.nextInt(start, end);
        return randomNum;
    }

}
