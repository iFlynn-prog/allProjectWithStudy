package Testing.progect.string;

/**
 * Текстовый блок позволяющий писать тескс внутри трех кавычек без конкантинаций
 */
public class TextBlocks {
    public static void main(String[] args) {
        String txt = """   
                Some 
                 text 
                    is
                    here 
                """;
        System.out.println(txt);
    }
}
