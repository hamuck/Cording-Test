import java.util.*;
class Solution {
 public long solution(int[] weights) {
        long answer = 0;

        // 가능한 비율들
        int[][] ratios = {
            {1, 1}, {2, 3}, {3, 2}, {2, 4}, {4, 2}, {3, 4}, {4, 3}
        };

        Map<Double, Integer> counter = new HashMap<>();

        for (int w : weights) {
            for (int[] ratio : ratios) {
                double target = (double) w * ratio[0] / ratio[1];
                answer += counter.getOrDefault(target, 0);
            }
            counter.put((double) w, counter.getOrDefault((double) w, 0) + 1);
        }

        return answer;
    }
}