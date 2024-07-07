function solution(food) {
    left = food.slice(1).reduce((acc, cur, index) => acc += (index + 1).toString().repeat(Math.floor(cur / 2)), '')
    right = [...left].reverse().join('');
    
    return left + 0 + right;
}