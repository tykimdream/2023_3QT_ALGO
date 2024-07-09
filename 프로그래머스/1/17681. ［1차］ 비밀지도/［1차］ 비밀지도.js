function solution(n, arr1, arr2) {
    return arr1.map((e, index) => {
        let code = ""
        let binA = [...e.toString(2).padStart(n, '0')];
        let binB = [...arr2[index].toString(2).padStart(n, '0')];
        
        binA.filter((bin, index) =>{
            if(bin == 1 || binB[index] == 1) code += "#"
            else code += " ";
        })
        return code;
    });
}