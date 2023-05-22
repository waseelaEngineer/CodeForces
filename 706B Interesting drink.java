import java.util.Arrays;
import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++)
			a[i] = in.nextInt();
		
		Arrays.sort(a);
		int q = in.nextInt();
		while(q-->0) {
			int x = in.nextInt();
			System.out.println(bin(0,n,x,a));
		}
	}
	
	static int bin (int start, int end, int target, int[] a) {
		while(start < end) {
			int mid = (start + end) / 2;
			if (a[mid] <= target)
				start = mid+1;
			else
				end=mid;
		}
		return start;
	}

}
