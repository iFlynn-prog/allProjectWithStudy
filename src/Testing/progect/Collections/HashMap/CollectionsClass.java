package Testing.progect.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CollectionsClass {
    public static void main(String[] args) {
    DictionaryFunctions();

    }
    public static void  DictionaryFunctions(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Ашан");
        map.put(2, "Икея");
        map.put(3, "Оби");
        map.put(4, "Пятерочка");
        map.put(5, "Магнит");

        for(var pair: map.entrySet()){
            System.out.println("key:" + pair.getKey()); //  Получить название ключа
            System.out.println("-->  value:" + pair.getValue()); // получить значение ячейки
            System.out.println();
        }
        System.out.println(map.get(4)); // вывод элемента с ключем 4 (Пятерочка)
        // map.remove(3);    Удалить значение по ключу
        // map.replace(2, "Мебель"); // Заменить ячейку с ключем 2 на Мебель

        System.out.println(map.toString()); // Вывод на печать ввиде строки
    }

}
