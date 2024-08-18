function solution(dartResult) {
    let result = [0, 0, 0]
    
    let dartSplitByRound = dartResult.match(/\d+[SDT][*#]?/g);
    dartSplitByRound.forEach((round, index) => {
        let score = parseInt(round);
        let bonus = round.match(/[SDT]/)[0];
        let option = round.match(/[*#]/) ? round.match(/[*#]/)[0] : null;
        
        switch(bonus){
            case 'S':
                break;
            case 'D':
                score = Math.pow(score, 2);
                break;
            case 'T':
                score = Math.pow(score, 3);
                break;
        }
        
        if(option){
            if(option == '*'){
                score *= 2;
                if(index > 0){
                    result[index - 1] *= 2;
                }
            }
            else if(option == '#')
                score *= -1;
        }
        result[index] = score;
    });
    return result.reduce((acc, cur) => acc + cur, 0);
}