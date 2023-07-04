import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> stack = new ArrayList<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int t = 0 ; t < arr[i] * 2; t++){
                    stack.add(arr[i]);
                }
            }else{
                for(int t = 0 ; t < arr[i]; t++){
                    stack.remove(stack.size() - 1);
                }
            }
        }
        int size = stack.size();
        int[] answer = new int[size];
        for(int i =0 ;i < size; i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}