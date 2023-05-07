import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		for (int i=0; i<n; i++) {
			String temp = sc.next();
			switch (temp) {
			case "++X":
			case "X++":
				x++;
				break;
			case "--X":
			case "X--":
				x--;
				break;
			}
		}
		System.out.println(x);
	}

}
