import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();//totaal no of elements
        int k=sc.nextInt();// we will check one by one 
        int count =2,cur;
        boolean isDeci= true;
        
        while(count <= n ){
            cur=sc.nextInt();
            count++;
            if(cur==k){
                System.out.println("false");
                return;
            }
            if(cur < k ){
                if(isDeci==false){
                    System.out.println("false");
                    return;
                }
            }
            else{
                if(isDeci == true){
                    isDeci= false;
                }
            }
            k=cur;
        }
System.out.println("true");
	}
}