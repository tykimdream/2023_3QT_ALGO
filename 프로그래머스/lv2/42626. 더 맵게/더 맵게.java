import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i = 0; i < scoville.length; i++) que.add(scoville[i]);
        
        while(que.peek() < K && que.size() > 1){
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        if(que.size() == 1 && que.poll() < K) answer = -1;
        return answer;
    }
}