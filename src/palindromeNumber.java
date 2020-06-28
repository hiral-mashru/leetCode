import java.util.*;
public class palindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
        return false;
    } else {
        int n = x;
        int r = 0;
        int pre_r = 0;
        while(x!=0){
            r = (r*10) + (x%10);
            if((r-(x%10))/10 != pre_r){
                return false;
            }
            pre_r = r;
            x /= 10;
        }
        if(r==n){
            return true;
        } else {
            return false;
        }
        }
    }
    public static void main(String[] args){
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromeNumber p = new palindromeNumber();
        System.out.println(p.isPalindrome(n));
    }
}
