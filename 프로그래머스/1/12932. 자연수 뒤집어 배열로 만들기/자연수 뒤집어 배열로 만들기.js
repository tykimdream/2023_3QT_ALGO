function solution(n) {
    return String(n).split("").reverse().map((e => e = parseInt(e)))
}