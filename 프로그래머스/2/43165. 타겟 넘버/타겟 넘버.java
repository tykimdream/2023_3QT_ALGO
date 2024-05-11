class Solution {
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, -1, 0);    
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int index, int sum){
        if(index == numbers.length -1 && sum == target){
            answer++;
            return;
        }
        if(index == numbers.length - 1) return ;
        
        dfs(numbers,target, index + 1, sum + numbers[index + 1]);
        dfs(numbers,target, index + 1, sum - numbers[index + 1]);
    }
}