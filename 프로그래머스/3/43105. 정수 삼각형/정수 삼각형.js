function solution(triangle) {
    const height = triangle.length;
    
    for (let i = height - 2; i >= 0; i--) {
        for (let j = 0; j <= i; j++) {
            triangle[i][j] += Math.max(triangle[i+1][j], triangle[i+1][j+1]);
        }
    }
    
    return triangle[0][0];
}