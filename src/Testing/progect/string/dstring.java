package Testing.progect.string;

public class dstring {
    public static void main(String[] args) {
        String st1 = "Java ";
        String st2 = "  java";
        String st3 = "I'm study JAVA";

        System.out.println("=============================================");

        int count = 0;   //цикл выводит символы и
        for (char i : st3.toCharArray())
            if (i == 'A') count++;
        System.out.println("Summa A" + count);

        System.out.println("=============================================");

        System.out.println(st1);
        System.out.println(st1.length()); //длина строки
        System.out.println(st1.concat(st1 + st2)); //объеденение строк (конкантинация)
        System.out.println(st1.charAt(3)); //возвращает символ строки

        if (st1 == st2) //сравнение строк
            System.out.println("Равны");
        else System.out.println("Не равны");

        System.out.println("===================================================");

        if (st1.equalsIgnoreCase(st2)) //сравнивает строки без учета регистра
            System.out.println("Равны");
        else System.out.println("Не равны");


        System.out.println(st1.trim()); //удаляет начальные и конечные пробелы
        System.out.println(st2.toUpperCase());  //переводит все символы строки в  верхний регистр
        System.out.println(st1.toLowerCase()); //переводит все символы строки в нижний регистр


    }
}
