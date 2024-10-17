import java.util.*;

public class Solution {
    public int solution(int n){
        
        String num = Integer.toString(n);
        char[] numArray = num.toCharArray();
        int sum = 0;
        
        for (char i : numArray){
            int intNum = Integer.parseInt(String.valueOf(i));
            sum += intNum;
        }
        
        System.out.println(sum);
        return sum;
    }
}