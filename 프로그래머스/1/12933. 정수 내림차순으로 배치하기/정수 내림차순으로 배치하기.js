function solution(n) {
    let answer = '';
    const arr = String(n).split("").sort().reverse()
    arr.map(e => answer += e);
    
    return parseInt(answer);
}