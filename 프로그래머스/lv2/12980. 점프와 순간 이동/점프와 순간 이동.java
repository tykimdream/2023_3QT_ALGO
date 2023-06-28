import java.util.*;

public class Solution {
    public int solution(int n) {
//         int[] dp = new int[n+1];
//         // 현재 위치 *2 or 앞으로 k칸 접근 k cost
//         dp[1] = 1;
//         dp[2] = 1;
        
//         for(int i = 3; i <= n; i++){
//             if(i % 2 == 0){
//                 dp[i] = Math.min(dp[i - 1] + 1, dp[i / 2]);
//             } else {
//                 dp[i] = Math.min(dp[i - 1] + 1, dp[(i - 1) / 2] + 1);
//             }
//         }
//         for(int i = 0; i <= n; i++){
//             System.out.print(dp[i] + " ");
//         }
        int answer = 1;
        while(n > 1){
            if(n % 2 == 0)
                n /= 2;
            else{
                n--;
                answer++;
            }
        }
        return answer;
    }
}
