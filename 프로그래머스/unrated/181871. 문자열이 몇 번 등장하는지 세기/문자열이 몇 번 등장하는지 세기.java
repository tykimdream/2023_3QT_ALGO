class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        int lenPat = pat.length();
        for(int i =0; i <= len - lenPat; i++){
            if(myString.substring(i, i + lenPat).contains(pat)) answer++;
        }
        return answer;
    }
}