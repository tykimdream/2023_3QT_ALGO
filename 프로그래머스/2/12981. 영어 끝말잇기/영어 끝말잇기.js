function solution(n, words) {
    let set = new Set();
    let len = words.length;
    
    set.add(words[0]);
    
    for(let i = 1; i < len; i++){
        if(set.has(words[i]) || words[i - 1].at(-1) != words[i].at(0)){
            return [i % n + 1, Math.ceil((i + 1) / n)];
        }
        set.add(words[i]);
    }
    
    return [0,0]
}