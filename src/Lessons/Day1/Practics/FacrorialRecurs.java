package Lessons.Day1.Practics;

public class FacrorialRecurs {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            res = factorial(n -1);
        }
        return res;
    }


}
