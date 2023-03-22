package iFlynnJava.Functions.Task1;

/**
 * Напишите функцию sum_range(start, end), которая суммирует все целые числа
 * от значения «start» до величины «end» включительно.
 * Если пользователь задаст первое число большее чем второе,
 * просто поменяйте их местами.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Сумма чисел в диапазоне:" + sum_range(10, 30));
    }

    public static int sum_range(int start, int end) {
        int summa = 0;
        if (start <= end) {
            while (start <= end) {
                summa = summa + start;
                start++;
            }
        } else {
            while (end <= start) {
                summa = summa + end;
                end++;
            }
        }
        return summa;
    }

}
