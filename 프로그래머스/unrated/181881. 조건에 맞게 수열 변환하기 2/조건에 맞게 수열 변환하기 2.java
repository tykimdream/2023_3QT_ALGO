class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            count = 0;
            while(true){
                int temp = arr[i];
                if(arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
                else if(arr[i] < 50 && arr[i] % 2 == 1) arr[i] = arr[i] * 2 + 1;
                
                if(temp == arr[i]){
                    answer = Math.max(answer, count);
                    // System.out.print(count + " ");
                    break;
                }
                count++;
            }
        }
        return answer;
    }
}