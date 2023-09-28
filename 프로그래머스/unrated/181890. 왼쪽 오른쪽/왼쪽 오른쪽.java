class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        for(int i = 0, len = str_list.length; i < len; i++){
            if(str_list[i].equals("l")){
                answer = new String[i];
                for(int j = 0; j < i; j++){
                    answer[j] = str_list[j];
                }
                break;
            }
            if(str_list[i].equals("r")){
                answer = new String[len - i - 1];
                for(int j = i + 1; j < len; j++){
                    answer[j - i - 1] = str_list[j];
                }
                break;
            }
        }
        return answer;
    }
}