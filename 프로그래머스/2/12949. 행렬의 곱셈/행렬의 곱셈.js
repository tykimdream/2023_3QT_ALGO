function solution(arr1, arr2) {
    var answer = [];
    
    // matrix = col * row
    let col = arr1.length;
    let row = arr2[0].length;
    let len = arr2.length;
    
    for(let i = 0; i < col; i++){
        let result = []
        for(let j = 0; j < row; j++){
            let sum = 0;
            for(let k = 0; k < len; k++){
                sum += arr1[i][k] * arr2[k][j]
            }
            result.push(sum);
        }
        answer.push(result)
    }
    
    return answer
}