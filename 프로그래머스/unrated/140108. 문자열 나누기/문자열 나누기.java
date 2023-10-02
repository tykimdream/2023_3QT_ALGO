import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        int len = s.length();
        for(int i = 0; i < len; i++){
            char temp = s.charAt(i);
            if(stack.size() == 0){
                stack.add(temp);
            } else if(stack.peek() == temp){
                stack.add(temp);
            } else if(stack.peek() != temp){
                stack.pop();
            }
            if(stack.size() == 0){
                answer++;
            }
        }
        if(stack.size() > 0) answer++;
        return answer;
    }
}