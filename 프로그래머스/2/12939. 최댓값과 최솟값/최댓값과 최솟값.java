class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int max = (Integer.MAX_VALUE - 1) * -1;
        int min = Integer.MAX_VALUE;
        for(String x : arr){
            int temp = Integer.parseInt(x);
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        answer += min + " " + max;
        
        return answer;
    }
}