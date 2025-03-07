import java.util.*;
public class Solution {
    public static int solution(int[] elements) {
        int n = elements.length;
        Set<Integer> uniqueSums = new HashSet<>();

        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n];
                }
                uniqueSums.add(sum);
            }
        }
        return uniqueSums.size();
    }
}