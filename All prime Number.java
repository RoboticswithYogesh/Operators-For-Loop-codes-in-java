import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i<=n ; i++){
            boolean isPrime = true;
            for (int j = 2; j<=i/2;j++){
                if (i%j ==0){
                    isPrime = false;
                    break;
                    
                }
            }
            if(isPrime){
                System.out.println(i);
                
            }
        }
		// Write your code here

	}
}
