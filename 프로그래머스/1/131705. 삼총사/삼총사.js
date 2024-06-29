function solution(number) {
    let students = number.length
    let visited = Array(students).fill(false);
    
    return comb(visited, number, 0, students, 0);
}

function comb(visited, number, start, size, depth){
    let answer = 0;
    if(depth == 3){
        return visited.reduce((acc, cur, index) => cur ? acc + number[index] : acc, 0) == 0 ? 1 : 0;
    }
    for(let i = start; i < size; i++){
        if(visited[i]) continue;
        visited[i] = true;
        answer += comb(visited, number, i + 1, size, depth + 1);
        visited[i] = false
    }
    return answer;
}