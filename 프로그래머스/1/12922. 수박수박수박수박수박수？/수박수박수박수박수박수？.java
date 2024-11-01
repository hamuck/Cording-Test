import java.util.*;
class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int num = n/2;
        
        for (int i = 0; i < num; i++){
            sb.append("수박");
        }
        if(n%2 == 1){
            sb.append("수");
        }
        answer = sb.toString();
        return answer;
    }
}