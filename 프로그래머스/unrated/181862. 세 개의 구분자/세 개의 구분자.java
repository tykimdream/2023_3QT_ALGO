import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();
        String temp ="";
        for(char c : myStr.toCharArray()){
            if(c == 'a' || c == 'b' || c == 'c'){
                if(temp.length() > 0){
                    list.add(temp);
                    temp = "";
                }
            } else{
                temp += c;
            }
        }
        
        if(temp.length() > 0) list.add(temp);
        
        if(list.size() > 0){
            String[] answer = new String[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        } else{
            return new String[]{"EMPTY"};
        }
    }
}