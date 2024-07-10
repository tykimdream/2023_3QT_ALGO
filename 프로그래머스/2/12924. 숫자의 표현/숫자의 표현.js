// function solution(n) {
//     let arr = Array(n).fill().map((_, i) => i + 1);
    
//     let acc = [arr[0]];
    
//     arr.map((a, index) =>{
//         if(index > 0){
//             acc.push(acc[index - 1] + a);
//         }
//     })
    
//     let count = 0;
    
//     for(let i = 0; i < acc.length; i++){
//         for(let j = 0; j <= i; j++){
//             if(acc[i] - acc[j] + arr[j] == n) {
//                 count++;
//             }
//         }
//     }
    
//     return count;
// }

function solution(n) {
    let count = 0;
    
    for(let i = 1; i < n; i++){
        let sum = 0;
        for(let j = i; j < n; j++){
            sum += j;
            if(sum == n){
                count++;
                break;
            }
            if(sum > n) break;
        }
    }
return count +1;
}