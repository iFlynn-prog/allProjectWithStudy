package Lessons.Day1;

public class Day1_1 {
     public static int sum(int a, int b, int c){
        int res = a+b+c;
        return res;
    }
    public static int sum(int a, int b, int c, int d){
        int res = a+b+c+d;
        return res;
    }
    // метод с переменным числом аргументов
    public static int sum(int ... arg){
        int res = 0;
        // цикл для коллекций
        for (int di:arg) res +=di;
        return res;
    }
    public static void main(String[] args) {
        short a, b=5, c=2;
        a=(short)(b+c);
        System.out.println(a);
        System.out.println(~a);
        // var ключевое слово, компилятор сам приводит к типу данных
       // var num = 5;
       
        System.out.println(sum(2,7,c,4, -9));
        
        int max;
        if(a>b) max = a;
        else max = b;
        // операция условие if
        max = (a>b) ? a: b;
        
    }
    
}
