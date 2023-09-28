import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> que1 = new LinkedList<>();
        Queue<String> que2 = new LinkedList<>();
        
        for(int i = 0; i < cards1.length; i++){
            que1.add(cards1[i]);
        }
        
        for(int i = 0; i < cards2.length; i++){
            que2.add(cards2[i]);
        }
        
        for(int i = 0, len = goal.length; i < len; i++){
            if(!que1.isEmpty() && que1.peek().equals(goal[i])){
                que1.poll();
            }
            else if(!que2.isEmpty() && que2.peek().equals(goal[i])){
                que2.poll();
            } else {
                return "No";
            }
        }
        // if(que1.isEmpty() && que2.isEmpty()) return "Yes";
        return "Yes";
    }
}