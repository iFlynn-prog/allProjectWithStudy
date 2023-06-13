package Lessons.Day4;
import java.io.*;
import java.nio.charset.Charset;

public class Day4_1 {
    public static void main(String[] args) throws Exception {
        int[] dat = {4, 1, 8, -5, 2};
        // write(dat, "data.txt");
        // read("data.txt");

        BufferedReader in =  new BufferedReader(
                new FileReader("unicode.txt", Charset.forName("UTF-16")));
        System.out.println(in.readLine());
        System.out.println(in.readLine());
    }

    static void read(String file) {
        try {
            DataInputStream in = new DataInputStream(
                    new FileInputStream(file));
            while (true) {
                System.out.println(in.readInt());
            }
        } catch (EOFException ex) {
            System.out.println("Конец файла");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    static void write(int[] d, String name) {
        try (DataOutputStream out = new DataOutputStream(
                new FileOutputStream(name))) {
            for (int num : d) out.writeInt(num);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}