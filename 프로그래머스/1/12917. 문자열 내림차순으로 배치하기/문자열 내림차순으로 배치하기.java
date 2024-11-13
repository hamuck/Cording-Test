import java.util.*;
class Solution {
      public String solution(String n) {
    
          String[] answer1 = n.split("");
          Arrays.sort(answer1, Collections.reverseOrder());
          StringBuilder sb = new StringBuilder();
        
          for (String sl : answer1){
            sb.append(sl);
        }

        return sb.toString();
    }
}