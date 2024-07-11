function solution(brown, yellow) {
    let carpet = brown + yellow;
    let totalSet = new Set([]);
    
    for(let i = 1; i <= Math.sqrt(carpet); i++){
        if(carpet % i == 0){
            totalSet.add([carpet / i, i])
        }
    }
    
    let yelloSet = new Set([]);
    for(let i = 1; i <= Math.sqrt(yellow); i++){
        if(yellow % i == 0){
            yelloSet.add([yellow / i, i])
        }
    }
    
    for([x, y] of yelloSet){
        for([ox, oy] of totalSet){
            if(ox == x + 2 && oy == y + 2) return [ox, oy];
        }
    }
}