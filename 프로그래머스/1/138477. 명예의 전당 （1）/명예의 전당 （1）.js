function solution(k, score) {
    let answer = [];
    let honor = [];
    
    score.map((e, index) => {
        if(index < k) honor.push(e)
        if(index >= k) {
            if(honor[0] < e) {
                honor = honor.slice(1);
                honor.push(e);
            }
        }
        
        honor.sort((a, b) => a - b);
        answer.push(honor[0]);
        }
    )

    return answer
}