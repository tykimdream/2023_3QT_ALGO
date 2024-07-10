function solution(n) {
    let countOne = n.toString(2).split("1").length
    while(true){
        n++;
        if(n.toString(2).split("1").length == countOne) return n;
    }
}