
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev =0;
        while (n!=0){
            int remainder = n%10;
            rev = rev *10+remainder;
            n = n/10;
            
        }
        System.out.println(rev);
	}
}
