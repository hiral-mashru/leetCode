import java.util.*;
public class lengthOfLongestSubstr {
    public int lengthOfLongestSubstring(String s) {
        char[] chArr = s.toCharArray();
        String substr = null;
        int len = 0;
        LinkedHashMap<Character, Integer> lh = new LinkedHashMap<Character, Integer>();
        for(int i=0;i<chArr.length;i++){
            char ch = chArr[i];
            
            if(!(lh.containsKey(chArr[i]))){
                lh.put(ch, i);
            }
            else{
                i=lh.get(ch);
                lh.clear();
            }
            if(lh.size()>len){
                len = lh.size();
                substr = lh.keySet().toString();
                System.out.println(substr);
            }
        }
        return len;
    }
    public static void main(String[] args){
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        lengthOfLongestSubstr l = new lengthOfLongestSubstr();
        System.out.println(l.lengthOfLongestSubstring(str));
    }
}
