
package Lessons.Day1;

public class Day1_3 {

    public static void main(String[] args) {
        int sum = 0;
        for (String s:args){
            System.out.println(s);
            sum = sum + Integer.parseInt(s);
        }
        System.out.println(sum);
    } 
}
