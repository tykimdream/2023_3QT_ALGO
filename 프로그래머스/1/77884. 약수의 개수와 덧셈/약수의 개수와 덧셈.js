function solution(left, right) {
    let answer = 0;
    for(let i = left; i <= right; i++){
        Math.sqrt(i) == parseInt(Math.sqrt(i)) ? answer -= i : answer += i;
    }
    return answer;
}