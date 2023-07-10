class Solution {
    public int solution(int chicken) {
        int answer = 0, coupon = 0;
        while(true){
            if(chicken >= 10){
                coupon = chicken / 10;
                answer += coupon;
                chicken = chicken - chicken / 10 * 10;
                chicken += coupon;
            } else {
                break;
            }
        }
        return answer;
    }
}