function solution(lottos, win_nums) {
    let answer = [];
    let potential = 0;
    let correct = 0;
    
    for(lotto of lottos){
        if(lotto == 0) potential++;
        for(win of win_nums){
            if(lotto == win) correct++;
        }
    }
    
    answer[0] = correct + potential > 1 ? 7 - (correct + potential) : 6;
    answer[1] = correct > 1 ? 7 - correct : 6;
    return answer;
}