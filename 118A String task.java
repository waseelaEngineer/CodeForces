import java.util.Scanner;

public class answer {

	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
        String word = in.next();
        word = word.toLowerCase();
        word = word.replaceAll("[aeiouy]", "");
 
        StringBuilder builder = new StringBuilder(word);
        
        for(int i=0; i<builder.length(); i+=2)
            builder.insert(i, '.');
        
        System.out.println(builder);
	}
}
