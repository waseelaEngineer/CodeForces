import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int i=0; i<5; i++)
			for (int j=0; j<5; j++)
				if (in.nextInt() == 1)
					System.out.println(Math.abs(i - 2) + Math.abs(j - 2));						
	}
}