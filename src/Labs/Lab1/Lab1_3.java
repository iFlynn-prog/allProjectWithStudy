package Labs.Lab1;

public class Lab1_3 {

    static String getBinary(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append(((num & 1) == 1) ? 1 : 0);
            num >>= 1;
            if (i == 7 || i == 15 || i == 23) sb.append(' ');
        }
        sb.reverse();
        return sb.toString();
    }
}
