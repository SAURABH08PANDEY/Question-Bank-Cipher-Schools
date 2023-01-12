// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<Character>(); 
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            switch(c){
                case '(':stack.push(')');break;
                case '{':stack.push('}');break;
                case '[':stack.push(']');break;
                case ')':if(stack.empty())return false;if(stack.pop()!=')')return false;break;
                case '}':if(stack.empty())return false;if(stack.pop()!='}')return false;break;
                case ']':if(stack.empty())return false;if(stack.pop()!=']')return false;break;
                
            }
        }
        if(stack.empty()){
                return true;
            }
            return false;
    }
}
