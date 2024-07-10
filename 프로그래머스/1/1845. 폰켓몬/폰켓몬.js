function solution(nums) {
    let set = new Set();
    
    nums.map(e => set.add(e));
    
    // num/2가 set보다 크면 set
    // num/2가 set보다 작으면 num/2
    
    return parseInt(nums.length / 2) > set.size ? set.size : parseInt(nums.length / 2)
}