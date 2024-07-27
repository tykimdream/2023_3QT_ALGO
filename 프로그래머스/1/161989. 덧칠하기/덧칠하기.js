function solution(n, m, section) {
    let answer = 0;
    
    while(section.length > 0){
        let temp = section.shift();
        answer++;
        while(section[0] < temp + m){
            section.shift();
        }
    }
    
    return answer;
}