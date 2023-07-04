class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int bias = 1;
        
        while(true){
            if(len <= bias) break;
            bias*=2;
        }
        int[] answer = new int[bias];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}