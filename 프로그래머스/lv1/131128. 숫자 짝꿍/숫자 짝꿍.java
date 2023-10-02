class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] dic1 = new int[10];
        int[] dic2 = new int[10];
        
        int len = X.length();
        for(int i = 0; i < len; i++){
            dic1[X.charAt(i) - '0']++;
        }
        len = Y.length();
        for(int i = 0; i < len; i++){
            dic2[Y.charAt(i) - '0']++;
        }
        
        for(int i = 9; i > 0; i--){
            int count = Math.min(dic1[i], dic2[i]);
                for(int t = 0; t < count; t++){
                    answer.append(i);
                }
        }
        
        int zeroCount = Math.min(dic1[0], dic2[0]);
        if(zeroCount > 0 && answer.length() == 0){
            return "0";
        } else{
            for(int t = 0; t < zeroCount; t++){
                    answer.append("0");
            }
        }
        
        
        if(answer.length() == 0) return "-1";
        
        return answer.toString();
    }
}