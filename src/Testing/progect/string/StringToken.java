package Testing.progect.string;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        StringTokenizer str =
                new StringTokenizer("Hello Java, Kotlin, Python, C++", " ");
        //Счетчик слов которые остались
        System.out.println(str.countTokens());
        // hasMoreTokens Проверка следующего слова после разделителя
        while (str.hasMoreTokens())
        //Вывод следующего слова по циклу
            System.out.println(str.nextToken());


    }
}
