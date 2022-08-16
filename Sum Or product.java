import java.util.*;
public class Main {
	public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0;
        int mul =1;
        if (c==1){
            while (n<13&& n>0){
                
                sum = sum +n;
                n--;   
            }
            System.out.println(sum);
        }
        else if (c==2){
            while (n>0){
                mul = mul*n;
                n--;
            }
            System.out.println(mul);
        }
        else {
            System.out.println(-1);
        }
	}
}
