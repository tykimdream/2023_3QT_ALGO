function solution(babbling) {
    let answer = 0;
    for(bab of babbling){
        if(bab.includes("ayaaya")
            || bab.includes("yeye")
            || bab.includes("woowoo")
            || bab.includes("mama")) continue;
        
        bab = bab.replaceAll('aya', ' ').replaceAll('ye', ' ').replaceAll('woo', ' ').replaceAll('ma', ' ');
        if(bab.trim().length == 0) answer++;
    }
    return answer;
}