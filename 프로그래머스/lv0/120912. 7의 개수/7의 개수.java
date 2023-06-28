class Solution {
    public int solution(int[] array) {
        String temp = "";
        for(int i = 0; i < array.length; i++){
            temp += array[i] + "";
        }
        return temp.length() - temp.replace("7", "").length();
    }
}