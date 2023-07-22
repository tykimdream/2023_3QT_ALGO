import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minQue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < operations.length; i++){
            String[] op = operations[i].split(" ");
            int num = Integer.parseInt(op[1]);
            if(op[0].equals("I")){
                maxQue.add(num);
                minQue.add(num);
            } else {
                if(minQue.size() < 1) continue;
                if(num == 1){
                    // 최댓값을 삭제
                    minQue.remove(maxQue.poll());
                } else if (num == -1){
                    // 최솟값을 삭제
                    maxQue.remove(minQue.poll());
                }
            }
        }
        
        if(maxQue.isEmpty()) return new int[]{0,0};
        
        answer[0] = maxQue.poll();
        answer[1] = minQue.poll();
        return answer;
    }
}