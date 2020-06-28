import java.io.*; 
import java.util.*; 
class validParanthesis
{    
  /*  public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++) {
            if(ch[i]=='{' || ch[i]=='[' || ch[i]=='('){
                stk.push(ch[i]);
            }
            else {
                if(!stk.empty()) {
                    
                    switch(ch[i]){
                        case '}' : 
                            if(stk.peek()=='{')
                                stk.pop();
                            else {
                                stk.push(ch[i]);
                            }
                            break;
                        case ']' : 
                            if(stk.peek()=='['){
                                stk.pop();
                            }
                            else {
                                stk.push(ch[i]);
                            }
                            break;
                        case ')' : 
                            if(stk.peek()=='(')
                                stk.pop();
                            else {
                                stk.push(ch[i]);
                            }
                            break;
                    }
                    
                }
                else {
                    return false;
                }
                
            }
        }
    return stk.empty();
    } */
    public boolean isValid(String s){
        HashMap<Character,Character> mappings = new HashMap<Character, Character>();
        mappings.put('}', '{');
        mappings.put(']', '[');
        mappings.put(')', '(');
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mappings.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();
                if(topElement!=mappings.get(c))
                    return false;
            }
            else {
                stack.push(c);
            }
        } 
        return stack.isEmpty();
    }
    public static void main (String[] args) 
    { 
        
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        validParanthesis vp = new validParanthesis();
        System.out.println(vp.isValid(s));
        
    }
}