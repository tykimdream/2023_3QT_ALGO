class Solution {
    public String solution(String my_string, int s, int e) {
        String front = my_string.substring(0, s);
        String target = my_string.substring(s, e + 1);
        String back = my_string.substring(e + 1);
        // System.out.println(front +" " + target + " " + back);
        String reverseTarget = "";
        for(int i = e - s; i >= 0; i--){
            reverseTarget += target.charAt(i)+"";
        }
        return front + reverseTarget + back;
    }
}