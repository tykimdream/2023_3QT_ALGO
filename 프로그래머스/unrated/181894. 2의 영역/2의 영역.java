import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int firstIndex = -1;
        int lastIndex = -1;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            if(arr[i] == 2){
                firstIndex = i;
                break;
            }
        }
        
        for(int i = 0; i < len; i++){
            if(arr[i] == 2){
                lastIndex = i;                
            }
        }
        
        if(firstIndex == -1){
            return new int[] {-1};
        }
        
        return Arrays.copyOfRange(arr, firstIndex, lastIndex+1);
    }
}