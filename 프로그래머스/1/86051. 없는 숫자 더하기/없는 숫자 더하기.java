import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 1; i <= 9; i++) {
            boolean contains = false;
            for (int number : numbers) {
                if (number == i) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                answer += i;
            }
        }
        return answer;
        }
    }