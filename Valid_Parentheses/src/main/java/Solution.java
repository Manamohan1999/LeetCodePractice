import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> parathesisStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(!parathesisStack.isEmpty()){
                if((parathesisStack.peek()=='(' && s.charAt(i) == ')')
                        || (parathesisStack.peek()=='{' && s.charAt(i) == '}')
                        || (parathesisStack.peek()=='[' && s.charAt(i) == ']')){
                    parathesisStack.pop();
                }else if(s.charAt(i) != ')' && s.charAt(i) != '}' && s.charAt(i) != ']'){
                    parathesisStack.push(s.charAt(i));
                }else{
                    return false;
                }
            }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                return false;
            }else{
                parathesisStack.push(s.charAt(i));
            }
        }
        return parathesisStack.isEmpty();
    }
}
