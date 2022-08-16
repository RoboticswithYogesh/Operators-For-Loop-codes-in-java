import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long bnum ,dnum =0,j =1,r ;
        bnum =s.nextLong();
        while (bnum !=0){
            r = bnum%10;
            dnum = dnum +r*j;
            j= j*2;
            bnum = bnum /10;
            
        }
        System.out.println("" + dnum);
        
        
		// Write your code here

	}
}
