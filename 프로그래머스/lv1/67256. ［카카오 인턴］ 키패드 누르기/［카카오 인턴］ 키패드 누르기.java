class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lx = 3; // 왼손의 x 좌표
        int ly = 0; // 왼손의 y 좌표
        int rx = 3; // 오른손의 x 좌표
        int ry = 2; // 오른손의 y 좌표
        
        for (int i = 0; i < numbers.length; i++) {
            int tx, ty;
            
            if (numbers[i] == 0) {
                tx = 3;
                ty = 1;
            } else {
                tx = (numbers[i] - 1) / 3; // 현재 숫자의 x 좌표
                ty = (numbers[i] - 1) % 3; // 현재 숫자의 y 좌표
            }
            
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                lx = tx;
                ly = ty;
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rx = tx;
                ry = ty;
            } else {
                int ld = Math.abs(tx - lx) + Math.abs(ty - ly); // 왼손까지의 거리
                int rd = Math.abs(tx - rx) + Math.abs(ty - ry); // 오른손까지의 거리
                
                if (ld < rd) {
                    answer += "L";
                    lx = tx;
                    ly = ty;
                } else if (ld > rd) {
                    answer += "R";
                    rx = tx;
                    ry = ty;
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        lx = tx;
                        ly = ty;
                    } else {
                        answer += "R";
                        rx = tx;
                        ry = ty;
                    }
                }
            }
        }
        return answer;
    }
}
