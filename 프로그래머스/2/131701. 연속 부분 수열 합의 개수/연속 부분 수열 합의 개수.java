import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        int[] arr = new int[len * 2];
        
        for(int i=0; i < len * 2; i++){
            arr[i] = elements[i % len];
        }
        
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= len; i++){
            int sum = 0;
            // 현재 길이의 sum을 구한다.
            for(int l = 0; l < i; l++){
                sum += arr[l];
            }
            
            // 이 sum을 기준으로 한 칸씩 밀면서
            // 부분 수열의 합을 구해나간다.
            int back = 0;
            int front = i;
            
            for(int t = 0; t < len; t++){
                set.add(sum);
                sum -= arr[back++];
                sum += arr[front++];
            }
        }    
        
        return set.size();
    }
}