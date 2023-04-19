package Lessons.Day1.Practics.fact2020;

public class PracticFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(2020));
    }

    public static long factorial(long n) {
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            System.out.println(res);
        }
        return res;
    }
}
