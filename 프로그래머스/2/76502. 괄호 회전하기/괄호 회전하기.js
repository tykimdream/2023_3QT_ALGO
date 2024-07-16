function bracketCheck(s){
    let pair = {
        '(' : ')',
        '{' : '}',
        '[' : ']',
    }
    let stack = [];

    for(bracket of s){
        if(bracket == '(' || bracket == '{' || bracket == '['){
            stack.push(bracket)
        } else{
            if(stack.length <= 0) return false;
            if(pair[stack.pop()] !== bracket) return false;
        }
    }
    return stack.length == 0 ? true : false;
}

function solution(s) {
    let answer = 0;
    let len = s.length;
    
    for(let i = 0; i < len; i++){
        answer += bracketCheck(s) ? 1 : 0;
        s = s.at(-1) + s.slice(0, -1);
        
    }
    return answer;
}