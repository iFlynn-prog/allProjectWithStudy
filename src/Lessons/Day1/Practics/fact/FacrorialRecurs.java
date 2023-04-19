package Lessons.Day1.Practics.fact;

public class FacrorialRecurs {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(recfact(5));
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
    public static int recfact(int n){
        int res = 0;
        for (int i = 1; i <= n ; i++) {
            res = n* factorial(n -1);

        }

        return res;
    }


}
