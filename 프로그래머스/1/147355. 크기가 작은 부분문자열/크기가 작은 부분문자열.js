function solution(t, p) {
    let len = p.length;
    return [...t].map((_, i) => t.substring(i, i + len))
        .filter(e => e.length === len)
        .filter(e => Number(e) <= p).length
}