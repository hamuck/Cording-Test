import java.util.*;
class Solution {
    boolean solution(String s) {
            int cnt = 0;
            String arr[] = s.split("");
            
            for(String i : arr){
                if(i.equals("(")){
                    cnt++;
                }else{
                    cnt--;
                }
                if (cnt < 0) {
                    return false;
                }
            }
        return cnt == 0;
    }
}