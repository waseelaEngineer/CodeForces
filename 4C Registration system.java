import java.util.HashMap;
import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, Integer> db = new HashMap<>();
		int n = in.nextInt();
		for (int i=0; i<n; i++) {
			String name = in.next();
			if (db.containsKey(name)) {
				int x = db.get(name);
				x++;
				db.put(name, x);
				System.out.println(name + x);
			}
			else {
				System.out.println("OK");
				db.put(name, 0);
			}
		}
	}
}
