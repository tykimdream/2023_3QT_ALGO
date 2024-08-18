class Stage {
    constructor(player, clear, index){
        this.player = player;
        this.clear = clear;
        this.index = index
    }
    addPlayer(){
        this.player += 1;
    }
    addClear(){
        this.clear += 1;
    }
}

function solution(N, stages) {
    let answer = [];
    for(let i = 1; i <= N; i++){
        answer[i] = new Stage(0, 0, i);
    }
    
    for(x of stages){
        // 내 이전의 라운드는 내가 클리어함.
        for(let i = 1; i < x; i++){
            answer[i].addPlayer();
            answer[i].addClear();
        }
        // 내 현재 라운드는 내가 도착함
        if(x <= N){
            answer[x].addPlayer();
        }
    }
    
    answer = answer.filter(stage => stage !== undefined);
        
    answer.sort((a, b) => {
        const failRateA = a.player === 0 ? 0 : (a.player - a.clear) / a.player;
        const failRateB = b.player === 0 ? 0 : (b.player - b.clear) / b.player;
            return failRateB - failRateA;

        // if (failRateB !== failRateA) {
        //     return failRateB - failRateA;
        // } else {
        //     return a.index - b.index;
        // }
    })
    
    return answer.map((e) => e.index);
}