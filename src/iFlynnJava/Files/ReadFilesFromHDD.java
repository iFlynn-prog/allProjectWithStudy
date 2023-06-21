package iFlynnJava.Files;
import java.io.File;

public class ReadFilesFromHDD {
    public static void main(String[] args) {
        File file = new File("C:/");

        File[] listOfFiles = file.listFiles(); // Создается массив в который помещается переменная file с атрибутом чтение файлов

        for(File item :listOfFiles){
            System.out.println(item.getName()); // Цикл для коллекций создаем переменную item в которую помещаются данные по цикцу из массива listOfFiles
                                                // и происходит вывод на экран параметром getName()
        }
    }
}


/**
 * Код для чтения файлов и каталогов с HDD
 */