package Testing.progect.Collections.ArrayList;

public class ArrayLinks {
    public static void main(String[] args) {
        ArrayLinks();

    }
    public static void ArrayLinks() {
        // Делаем ссылку
        int[] array;
        // Инициализируем (выделяем память)
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}; //10 элементов

        // Выводим основной массив
        for (int element: array) {
            System.out.print(element + " ");
        }

        int[] array_another = new int[5];

        System.out.println();
        // Выводим второй массив
        for (int element: array_another) {
            System.out.print(element + " ");
        }
        System.out.println();
        array = array_another;
        for (int i = 0; i < array_another.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
