import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = 0;
		int y = 0;
		int z = 0;
		for (int i=0; i<n; i++) {
			x = x + in.nextInt();
			y = y + in.nextInt();
			z = z + in.nextInt();
		}
		if (x == 0 && y == 0 && z == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
