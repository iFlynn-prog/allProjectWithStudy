package iFlynnJava.Examples;

import java.io.*;
import java.util.Collection;

public class Fileswrite {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        //Создание файла
        try {
            File file = new File("newfile.txt");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(file);
            pw.println("Запись в файл 1");
            pw.println("Запись в файл 2");
            pw.println("Последняя запись");
            pw.close(); //Окончание создания файла

            br = new BufferedReader(new FileReader("newfile.txt"));
            String line;
            //В переменную line записываем новую строку которую считали из
            // newfile.txt выполнется пока новая строка br.readLine() пока не будет пустой
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            System.out.println("File not found" + ex);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
