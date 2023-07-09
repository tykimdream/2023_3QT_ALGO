import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
            for(int i = 2; i <= n; i++){
                if(n % i == 0) {
                    if(!list.contains(i))
                    list.add(i);
                    n /= i;
                    i--;
                }
            }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}