class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            char temp = s.charAt(i);
            for(int t = 0; t < index; t++){
                temp += 1;
                if(temp > 'z') temp -= 26;
                if(skip.contains(String.valueOf(temp))) t--;
            }
            answer += temp;
        }
        return answer;
    }
}