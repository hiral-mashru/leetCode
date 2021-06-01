import java.util.*;

public class romanToInt {
    
    public int romanToInt(String s) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("I",1);
        hm.put("V",5);
        hm.put("X",10);
        hm.put("L",50);
        hm.put("C",100);
        hm.put("D",500);
        hm.put("M",1000);
        
        int num = 0;
    
        for(int i=0;i<s.length();i++){
            String a = "";
            if(!hm.containsKey(a+s.charAt(i))){
                break;
            } else
            if(i!=0 && (hm.get(a+s.charAt(i-1))<hm.get(a+s.charAt(i)))){
                num += hm.get(a+s.charAt(i))-hm.get(a+s.charAt(i-1)) - hm.get(a+s.charAt(i-1));
            } else 
            if(hm.containsKey(a+s.charAt(i))){
                num += hm.get(a+s.charAt(i));
            }
        }
        
        return num;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        romanToInt r = new romanToInt();
        System.out.println(r.romanToInt(str));
    }
}
