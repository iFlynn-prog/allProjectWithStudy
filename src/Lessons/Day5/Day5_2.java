package Lessons.Day5;

import java.io.File;
import java.io.FileFilter;
import java.util.LinkedList;
import java.util.List;

class Filter8 implements FileFilter {

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".txt");
    }
}

public class Day5_2 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList(List.of(5, 2, 1, 8, 5, 9, 4, 6, 7));
        var ilist = list.stream().mapToInt(x -> x).filter(x -> x % 2 == 0);
        list.add(-8);
        System.out.println(ilist.sum());

        File dir = new File(".");

        // File [] fs = dir.listFiles();
        // File [] fs = dir.listFiles(new Filter8());
        /** File [] fs = dir.listFiles(new FileFilter() {
         public boolean accept(File f) { //Анонимный класс
         return f.isFile();
         }
         });*/

        // File [] fs = dir.listFiles(x -> x.isDirectory()); //лямда-выражение реализует интерфейсы
        // File[] fs = dir.listFiles(Day5_2::test); //Ссылка на метод ::

        /** for (var item : fs) {
         System.out.println(item);
         }*/
    }

    public static boolean test(File f) {
        return f.getName().startsWith("a");
    }
}
