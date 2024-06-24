function solution(x) {
    return x % String(x).split("").reduce((sum, cur) => sum + parseInt(cur), 0) == 0 ? true : false;
}