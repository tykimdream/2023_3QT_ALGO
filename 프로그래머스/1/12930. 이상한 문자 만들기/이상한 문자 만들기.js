function solution(s) {
    let arr = s.split(" ")
    return arr.map((word) => [...word].map((e, i) => i % 2 == 0 
                                           ? e.toUpperCase() : e.toLowerCase()).join('')).join(" ")
    
}