package Labs.Lab4;

import java.io.*;
import java.util.*;

class KeyValue implements Comparable<KeyValue> {
    private String key;
    private int val;

    public KeyValue(String key, int val) {
        this.key = key;
        this.val = val;
    }

    public String toString() {
        return key + " - " + val;

    }
    public int compareTo(KeyValue obj) {
      int res = val - obj.val;
        if (res == 0) res = key.compareTo(obj.key);
      return res;
    }
}


public class WordCounter {
    private static String testString = "some test string, do some test test";
    private String inFile;
    private Map words = new TreeMap();

    public WordCounter(String inFile) {
        this.inFile = inFile;
    }

    public Map getWords() {
        return words;
    }

    public Set getValue() {
        Set set = new TreeSet();
        for (var item : words.entrySet()) {
            Map.Entry entry = (Map.Entry) item;
            set.add(new KeyValue((String) entry.getKey(), (Integer) entry.getValue()));
        }
        return set;
    }
    public void countWords() throws IOException {
        Reader reader;

        if (inFile != null) reader = new FileReader(inFile);
        else reader = new StringReader(testString);

        BufferedReader br = new BufferedReader(reader);

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            StringTokenizer st = new StringTokenizer(line, " ,./\\;:!?");

            while (st.hasMoreTokens()) {
                String token = st.nextToken();

                if (words.containsKey(token) == false) words.put(token, 1);
                else {
                    Object val = words.get(token);
                    int n = (int) val;
                    n++;
                    words.put(token, n);
                }
            }
        }
        br.close();
    }
}
