import java.util.Scanner;

public class answer {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        
        long countn = n/a;
	    long countm = m/a;
	    
        if(n%a != 0) countn++;
        if(m%a != 0) countm++;
            
        System.out.println(countn*countm);
	}
}