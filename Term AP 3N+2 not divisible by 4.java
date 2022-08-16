import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =0;
        for (int N =1;count<n;N++){
            int ap = 3*N+2;
            if (ap%4!=0){
                System.out.print(ap+" ");
                count++;
            }
        }
    
  
}
}
