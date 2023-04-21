package Testing.progect.string;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("This is FIRST text");
        StringBuilder sb1 = new StringBuilder("This is a SECOND text");
        System.out.println(sb.append("FIRST"));
        System.out.println(sb.reverse());

        System.out.println(sb.lastIndexOf("i"));
        //lastIndexOf возвращает индекс в данной строке последнего вхождения указанного символа или -1,
        // если символ не встречается.

        System.out.println(sb.compareTo(sb1));

    }
}
