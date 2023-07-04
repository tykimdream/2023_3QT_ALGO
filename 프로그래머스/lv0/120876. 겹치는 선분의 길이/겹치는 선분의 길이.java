class Solution {
    public int solution(int[][] lines) {
        int[] range = new int[201];
        // 0 <- -100
        for(int i = 0; i < lines.length; i++){
            for(int j = lines[i][0] ; j < lines[i][1]; j++){
                range[j + 100]++;
            }
        }
        // boolean flag = false;
        int max = 0;
        // int local = 0;
        // for(int i = 0; i < range.length; i++){
        //     if(range[i] >= 2){
        //         flag = true;
        //     }else {
        //         flag = false;
        //         max = Math.max(max, local);
        //         local = 0;
        //     }
        //     if(flag) local++;
        // }
        for(int i = 0; i < range.length; i++){
            if(range[i] >= 2) max++;
        }
        return max;
    }
}