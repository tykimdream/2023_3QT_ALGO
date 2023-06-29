import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] arr = new int[len * 2];
        for(int i = 0; i < len * 2; i++){
            arr[i] = elements[i % len];
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= len; i++){
            int back = 0;
            int front = i;
            int sum = 0;
            
            for(int l = 0; l < i; l++){
                sum+=arr[l];
            }
            
            for(int j = 0; j < len; j++){
                set.add(sum);
                sum -= arr[back];
                back++;
                sum += arr[front];
                front++;
            }
        }
        return set.size();
    }
}