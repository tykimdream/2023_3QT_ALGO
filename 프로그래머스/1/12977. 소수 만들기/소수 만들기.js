function solution(nums) {
    const isPrime = (a) => {
        for(let i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    let len = nums.length;
    let answer = 0;
    
    for(let a = 0; a < len; a++){
        for(let b = a + 1; b < len; b++){
            for(let c = b + 1; c < len; c++){
                answer += isPrime(nums[a] + nums[b] + nums[c]) ? 1 : 0;
            }
        }
    }
    
    return answer;
}