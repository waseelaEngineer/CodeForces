import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first1 = in.next();
        String second1 = in.next();
       
        String first = first1.toLowerCase();
        String second = second1.toLowerCase();
              
        if(first.compareTo(second) ==0){
            System.out.println("0");
        }
        if(first.compareTo(second) > 0){
            System.out.println("1");
        }
        if(first.compareTo(second) < 0){
            System.out.println("-1");           
        }
	}

}
