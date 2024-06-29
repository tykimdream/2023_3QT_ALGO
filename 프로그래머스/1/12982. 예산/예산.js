function solution(d, budget) {
    let answer = d.sort((a, b) => a - b).map(e => budget -= e).findIndex(e => e < 0);
    return answer == -1 ? d.length : answer;
}