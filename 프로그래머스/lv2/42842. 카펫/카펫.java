class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 1. 총 면적 = b + y
        // 2. y = (w-2) * (h-2)
        // w = 총 면적 / h
        // h = 총 면적 / w
        // w, h 중 하나를 기준으로 반복문을 돌리고, 1,2 조건에 부합하는 경우를 찾는다.
        
        int space = brown + yellow;
        for(int w = space - 1; w > 0; w--){
            if(space % w != 0) continue;
            int h = space / w;
            int y_space = (w-2) * (h-2);
            int b_space = space - y_space;
            if(y_space == yellow && b_space == brown){
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        
        return answer;
    }
}