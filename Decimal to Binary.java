import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        int n,count=0,a;
        String x="";
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n==0){
            System.out.print(n);
            return ;
            
        }
        while (n>0){
            a = n%2;
            x = a+""+x;
            n= n/2;
            
        }
		System.out.println(x);
        // Write your code here

	}
}
