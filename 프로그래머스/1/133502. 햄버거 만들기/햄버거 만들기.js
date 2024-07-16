function solution(ingredient) {
    const stack = [];
    let count = 0;
    
    for (item of ingredient) {
        stack.push(item);
        
        if (stack.length >= 4 && stack.slice(-4).join('') === '1231') {
            stack.splice(-4);
            count++;
        }
    }
    
    return count;
}