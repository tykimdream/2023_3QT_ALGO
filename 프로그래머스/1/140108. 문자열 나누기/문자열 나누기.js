function solution(s) {
    let answer = 0;
    let stack = [];
    for(x of s){
        stack.push(x);
        let std = stack.filter(e => e == stack[0])
        let dif = stack.filter(e => e != stack[0])
        
        if(std.length * 2== stack.length){
            answer++;
            stack = []
        }
    }
    if(stack.length > 0) answer++;
    return answer;
}