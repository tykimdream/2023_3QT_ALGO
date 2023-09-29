class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        for(int i = 0; i < win_nums.length; i++){
            for(int j = 0; j < lottos.length; j++){
                if(win_nums[i] == lottos[j]) win_nums[i] = -1;
            }
        }
        
        // hit는 현재 맞은 수를 계산한 것
        int hit = 0;
        for(int i = 0; i < win_nums.length; i++){
            if(win_nums[i] == -1) hit++;
        }
        
        int pot = 0;
        for(int i = 0; i < lottos.length; i++) if(lottos[i] == 0) pot++;
        answer[0] = 7 - hit - pot;
        answer[1] = 7 - hit;
        
        if(answer[0] == 0) answer[0]++;
        if(answer[0] == 7) answer[0]--;
        if(answer[1] == 7) answer[1]--;
        
        return answer;
    }
}