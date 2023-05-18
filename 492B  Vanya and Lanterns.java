import java.util.Arrays;
import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++)
			arr[i] = in.nextInt();
		
		Arrays.sort(arr);
		int max = 0;
		for (int i=1; i<n; i++)
			max = Math.max(max, arr[i] - arr[i - 1]);
		
		Double ans = (double) max / 2.0;
		
		if (arr[0] != 0) ans = Math.max(ans, arr[0]);
		if (arr[n-1] != l) ans = Math.max(ans, l - arr[n-1]);
		
		System.out.println(ans);
	}

}
