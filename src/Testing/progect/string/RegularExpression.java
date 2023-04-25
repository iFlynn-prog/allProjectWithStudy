package Testing.progect.string;

import java.util.regex.Pattern;

/**
 * Шаблоны регулярных выражений нужно искать в интренете
 * чтобы не заморачиваться с шаблонами
 */


public class RegularExpression {
    public static void main(String[] args) {
        String s[] ={
            "Cobol", "Java", "Python", "C++", "JavaScript", "ada"
        };
        Pattern p = Pattern.compile("^j.");

        for (var item:s)
            if (p.matcher(item).matches())
                System.out.println(item);
    }
}
