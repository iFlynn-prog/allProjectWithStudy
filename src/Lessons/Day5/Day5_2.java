package Lessons.Day5;

import java.io.*;

class Filter8 implements FileFilter {

    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".txt");
    }
}

public class Day5_2 {
    public static void main(String[] args) {
        File dir = new File(".");

       // File [] fs = dir.listFiles();
        // File [] fs = dir.listFiles(new Filter8());
        File [] fs = dir.listFiles(new FileFilter() {
            public boolean accept(File f) { //Анонимный класс
                return f.isFile();
            }
        });


        for(var item:fs){
            System.out.println(item);
        }
    }
}
