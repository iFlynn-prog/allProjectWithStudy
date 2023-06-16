package Lessons.Day4;

import java.util.Properties;

public class Day4_3 {
    public static <T extends Comparable> T max2(T a, T b) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        return max;
    }

    public static void main(String[] args) {

        System.out.println(max2(4, 8));
        Properties ps = System.getProperties();
        System.out.println(System.getProperty("native.encoding"));
        /**
         for ( var  item: ps.entrySet())
         System.out.println(item);
         */

    }
}
