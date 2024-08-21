function solution(clothes) {
    var answer = 1;
    let map = new Map();
    
    for(cloth of clothes){
        if(map.has(cloth[1])) map.set(cloth[1], map.get(cloth[1]) + 1)
        else map.set(cloth[1], 1);
    }
    
    for(x of [...map]){
        answer *= (x[1] + 1)
    }
    
    return --answer;
}