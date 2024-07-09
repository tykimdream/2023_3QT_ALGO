function solution(a, b, n) {
    let answer = 0;
    
    while(n >= a){
        let retrive = Math.floor(n / a) * b;
        answer += retrive;
        n = n % a + retrive;
    }
    return answer;
}