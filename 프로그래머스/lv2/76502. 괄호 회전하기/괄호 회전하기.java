import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String original = s;
        
        for(int i = 0, len = s.length(); i < len; i++){
            char[] c = s.toCharArray();
            answer += isRight(c);
            String temp = s.substring(1, len);
            temp += (s.charAt(0) +"");
            s = temp;
        }
        
        return answer;
    }
    public int isRight(char[] list) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0, len = list.length; i < len; i++){
            if(stack.isEmpty()){
                stack.push(list[i]);
            } else{
                if(stack.peek() == '(' && list[i] == ')') {
                    stack.pop();
                }
                else if(stack.peek() == '{' && list[i] == '}') {
                    stack.pop();
                }
                else if(stack.peek() == '[' && list[i] == ']') {
                    stack.pop();
                }
                else{ 
                    stack.push(list[i]);}
            }
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}