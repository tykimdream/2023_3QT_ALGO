class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int len = my_string.length();
        int[] flag = new int[len];
        
        for(int i =0; i < indices.length; i++){
            flag[indices[i]] = 1;
        }
        
        for(int i = 0; i < len; i++){
            if(flag[i]==0){
                answer += my_string.charAt(i) +"";
            }
        }
        return answer;
    }
}