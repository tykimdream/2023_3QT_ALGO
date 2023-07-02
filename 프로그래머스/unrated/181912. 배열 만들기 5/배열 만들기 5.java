import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            // System.out.println(intStrs[i].substring(s, s+l));
            int x = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(x > k){
                list.add(x);        
            }
        }
        int[]  answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}