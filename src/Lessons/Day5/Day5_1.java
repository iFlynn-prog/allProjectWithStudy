package Lessons.Day5;

/**
 * Внутренние классы
 */

class Upper {
    private int num = 5;

    Upper() {
        new Inner().print();
    }

    class Inner {
      static   int num = 3; // Создание статического объекта во внутреннем классе

        private void print() {
            System.out.println(Upper.this.num);
        }
    }
}

public class Day5_1 {
    public static void main(String[] args) {

        Upper up = new Upper();
        Upper.Inner in = null;
        in = up.new Inner();  //Создает объект внутренненго класса и передает ссылку Inner на внешний объект

    }
}
