import java.util.*;
class Solution {
      public long solution(long n) {
    
        String s = String.valueOf(n);
        String[] answer1 = Long.toString(n).split("");
        Arrays.sort(answer1, Collections.reverseOrder());
        String answer2 = "";
          for(String a : answer1){
              answer2 += a;
          }
          
          long answer = Long.parseLong(answer2);
          

        return answer;
    }
}