function solution(people, limit) {
    // 보트에는 최대 2명 밖에 탈 수 없다.
    // 가벼운 사람 + 무거운 사람이 최적
    
    // 정렬 후 맨 앞과 맨 뒤에서 뽑아서, 같이 태울 수 있으면 태우고,
    // 못태우면 무거운 사람만 태워서 보내자.
    let answer = 0;
    people.sort((a, b) => b - a);
    
    let left = 0;
    let right = people.length - 1;
    
    while(left <= right){
        rest = limit - people[left++];
        if(rest >= people[right]){
            right--;
        }
        answer++;
    }
    
    // while(people.length > 0){
    //     rest = limit - people.shift();
    //     if(rest >= people.at(-1)){
    //         people.pop();
    //     }
    //     answer++;
    // }

    return answer;
}