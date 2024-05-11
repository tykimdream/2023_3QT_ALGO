class Solution {
    
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, -1, 0);    
    }
    
    public int dfs(int[] numbers, int target, int index, int sum){
        if(index == numbers.length -1 && sum == target){
            return 1;
        }
        if(index == numbers.length - 1) return 0;
        
        return dfs(numbers,target, index + 1, sum + numbers[index + 1]) + dfs(numbers,target, index + 1, sum - numbers[index + 1]);
    }
}