function solution(citations) {
    citations.sort((a, b) => b - a);
    let h = 0;
    
    while(h < citations.length && citations[h] > h) h++
    
    return h;
}