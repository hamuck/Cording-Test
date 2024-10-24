import java.util.*;
class Solution {
      public long solution(long n) {
    
        
          String s = String.valueOf(n);
          String[] answer1 = Long.toString(n).split("");
          Arrays.sort(answer1, Collections.reverseOrder());
          StringBuilder sb = new StringBuilder();
        
          for (String sl : answer1){
            sb.append(sl);
        }
          long answer = Long.parseLong(sb.toString());
          

        return answer;
    }
}