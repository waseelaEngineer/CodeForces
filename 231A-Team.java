import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ctr=0,s=0;
        int[] a = new int[3];
        
        for(int i=1; i<=n; i++){
        	
            for(int j=0; j<=2; j++){
            	
                a[j] = sc.nextInt();
                s = a[0]+a[1]+a[2];
            }
            if (s > 1) ctr++;
        }
        System.out.println(ctr);
	}
}