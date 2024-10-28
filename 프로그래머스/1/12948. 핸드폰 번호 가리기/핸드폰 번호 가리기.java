import java.util.ArrayList;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] list = phone_number.split("");
        for (int i = 0; i<list.length; i++){
            if (i <= list.length - 5){
                answer += "*";
            }else{
                answer += list[i];
            }
        }
        return answer;
    }
}