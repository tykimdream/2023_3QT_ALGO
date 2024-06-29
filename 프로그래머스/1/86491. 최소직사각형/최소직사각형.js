function solution(sizes) {
    let b_b = 0
    let s_b = 0
    
    sizes.forEach((e) => {
        b_b = Math.max(b_b, Math.max(e[0], e[1]))
        s_b = Math.max(s_b, Math.min(e[0], e[1]))
    })
    
    return b_b * s_b;
}