class Solution {
    static boolean[] visited;
    static int answer;

    public int solution(int k, int[][] dungeons) {   
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);
    
        return answer;
    }
   
    public static void dfs(int depth, int k, int[][]dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i] == false && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(depth+1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}