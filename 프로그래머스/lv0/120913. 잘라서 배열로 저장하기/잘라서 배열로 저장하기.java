class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int len = my_str.length();
        int term = 0;
        if(len % n == 0){
            // 딱 떨어지는 경우
            term = len / n;
        } else{
            term = len / n + 1;
        }
        answer = new String[term];
        for(int i = 0; i < term; i++){
            int start = i * n;
            answer[i] = "";
            for(int j = 0; j < n && j + start < len; j++){
                answer[i] += (my_str.charAt(j + start) + "");
            }
        }
        
        return answer;
    }
}