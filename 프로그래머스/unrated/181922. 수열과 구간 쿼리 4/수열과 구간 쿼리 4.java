class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        
        for(int i = 0; i < len; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int t = s; t <= e; t++){
                if(t % k == 0) arr[t]++;
            }
        }
        return arr;
    }
}