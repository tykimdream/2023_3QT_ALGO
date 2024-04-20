import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int i : scoville){
            que.add(i);            
        }
        while(que.size() > 1 && que.peek() < K){
            que.add(que.poll() + que.poll() * 2);
            answer++;
        }
        if(que.size() > 0 && que.peek() < K) return -1;
        return answer;
    }
}