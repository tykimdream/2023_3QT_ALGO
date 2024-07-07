function solution(s) {
    let arr = s.split("");
    
    return arr.map((e, index) => arr.slice(0, index).lastIndexOf(e) === -1 ?
                   -1 : index - arr.slice(0, index).lastIndexOf(e));
}