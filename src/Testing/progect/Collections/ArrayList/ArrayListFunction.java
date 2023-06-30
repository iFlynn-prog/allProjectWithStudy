package Testing.progect.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListFunction {
    public static void main(String[] args) {
        ArrayListFunctions();

    }

    public static void ArrayListFunctions() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);

        /** arrayList.set(2, -1); // вставить значение в ячейку 2, значение -1, текущее значение 3 будет удалено
         arrayList.add(3, 0); // вставить в индекс 3, значение 0, массив расширится
         for (Integer el : arrayList) { System.out.print(el + " ");}
         arrayList.remove(0); // удаление элемента по индексу */


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");}
        if (arrayList.contains(0)) {
            System.out.println(" YES ");}
        else {
            System.out.println(" NO ");
        }

        /**
         * Метод contains() – это метод Java, позволяющий проверить, содержит ли String другую подстроку или нет.
         * Возвращает логическое значение, поэтому его можно использовать непосредственно внутри операторов if.
         */

         System.out.println("size = " + arrayList.size()); // Размер массива
         System.out.println("index of element 3 = " + arrayList.lastIndexOf(3)); // индекс элемента 3

    }
}


