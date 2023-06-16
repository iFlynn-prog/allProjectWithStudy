/**
 * Серилизация
 * Процесс сохранения данных на жесткий диск
 * 1:37 (4 видео)
 * transient ключевое слово которое помогает не загружать данные на диск
 */

package Lessons.Day4;

import java.io.*;
import java.util.*;

class Employee implements Serializable {
    String fname;
    int id;
    Date date;

    public Employee(String s) {
        fname = s;
        id = 17;
        date = new Date();
    }

}
public class Day4_2 {
    public static void main(String[] args) throws Exception {
        /**
         FileOutputStream f = new FileOutputStream("Empl.txt");
        ObjectOutputStream s = new ObjectOutputStream(f);
        s.writeObject(new Employee("Alex"));
        s.close();
         Запись в файл
         */

     FileInputStream f2 = new FileInputStream("Empl.txt");
        ObjectInputStream s2 = new ObjectInputStream(f2);
        Employee emp = (Employee) s2.readObject();
        s2.close();

        System.out.println(emp.date);
        System.out.println(emp.fname);

        /**Форматирование даты*/
        Formatter form = new Formatter();
        Calendar dat = Calendar.getInstance();
        form.format(Locale.JAPANESE,"%tA %1$tB %1$tY", dat);
        System.out.println(form);

    }
}
