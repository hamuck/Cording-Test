import java.util.*;
import java.lang.Integer;
class Solution {
   public int[] solution(String s) {
       int roofCnt = 0;
       int zeroCnt = 0;
       
       while(!s.equals("1")){
           int sLength = s.length(); 
           s = s.replace("0", "");
           zeroCnt += sLength - s.length();
           
           s = Integer.toBinaryString(s.length());
           roofCnt++;
       }
       return new int[]{roofCnt, zeroCnt};
    }
}
