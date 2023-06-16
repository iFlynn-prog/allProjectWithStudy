package Labs.Lab4;

public class MyCounter {
    public static void main(String[] args) throws java.io.IOException {
        
//        WordCounter wc=new WordCounter(null);

       WordCounter wc=new WordCounter("readme.txt");
        wc.countWords();

        for(Object obj : wc.getValue()) {
            System.out.println(obj);
        }

//       for(Object obj : wc.getWords().entrySet()) {
//           System.out.println(obj);
//       }
	}
}
