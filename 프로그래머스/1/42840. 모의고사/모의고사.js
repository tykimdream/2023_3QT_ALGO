function solution(answers) {
    let point_arr = [0, 0, 0];
    
    let p1_arr = [1, 2, 3, 4, 5];
    let p2_arr = [2, 1, 2, 3, 2, 4, 2, 5];
    let p3_arr = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    answers.forEach((e, index) => {
        if(e === p1_arr[index % p1_arr.length]) point_arr[0]++;
        if(e === p2_arr[index % p2_arr.length]) point_arr[1]++;
        if(e === p3_arr[index % p3_arr.length]) point_arr[2]++;
    });
    
    let max = Math.max(...point_arr);
    
    return point_arr.reduce((result, score, index) => {
        if (score === max) {
            result.push(index + 1);
        }
        return result;
    }, []);
}