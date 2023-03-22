
package Lessons.Day1;

public class Day1_2 {
    public static int factorial(int n){
        int res = 1;
        for (int i =1; i <= n; ++i) res *= i;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
        int dat[][] = { {5,2,8,1,2}, {2,3} };
//        System.out.println(dat.length);
//        System.out.println(dat[0].length);
//        System.out.println(dat[1].length);
        
        System.out.println("summa=" +sum(dat[0], dat[1], dat[0]));
        
        System.out.println(Double.parseDouble("51.4e-2"));
    }
    public static int sum(int[] ... arg){
        int res = 0;
        for (int[] vec:arg) 
             for (int x:vec) res +=x;
        
        return res;
    }
    
}
