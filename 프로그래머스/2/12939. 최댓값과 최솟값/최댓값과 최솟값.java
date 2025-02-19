import java.util.*;
class Solution {
    public String solution(String s) {
        int numbers[] = Arrays.stream(s.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        Arrays.sort(numbers);
        StringBuilder answer = new StringBuilder("");
        
        answer.append(numbers[0]).append(" ").append(numbers[numbers.length - 1]);
        return answer.toString();
    }
}