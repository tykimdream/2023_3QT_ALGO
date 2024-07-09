function solution(name, yearning, photo) {
    let answer = []
    for(photos of photo){
        answer.push(photos.reduce((acc, cur) => {
            if(name.includes(cur)){
                return acc + yearning[name.indexOf(cur)]
            }
            return acc;
        }, 0))
    }
                    
    return answer;
}