import java.util.Scanner;
import java.lang.*;
public class reverseInt {
    public int reverseInt(int x){
        int r = 0;
        int pre_rev = 0;
        while(x!=0){
            r = r*10+x%10;            
            if((r-(x%10))/10 != pre_rev){
                return 0;
            } 
            pre_rev = r;
            x /= 10;
        }
         
       return r;
                
    }
    public static void main(String[] args){
        System.out.println("Enter int : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseInt r = new reverseInt();
        System.out.print(r.reverseInt(n));
        
    }
}
