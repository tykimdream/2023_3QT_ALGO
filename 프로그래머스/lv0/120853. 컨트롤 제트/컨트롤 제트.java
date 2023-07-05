import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals("Z")) stack.pop();
            else stack.push(Integer.parseInt(temp[i]));
        }
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }
}