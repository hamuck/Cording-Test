import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);

        int[] counts = new int[tangerine.length];
        int index = 0;
        counts[0] = 1;

        for (int i = 1; i < tangerine.length; i++) {
            if (tangerine[i] == tangerine[i - 1]) {
                counts[index]++;
            } else {
                index++;
                counts[index] = 1;
            }
        }
        
        Arrays.sort(counts, 0, index + 1); // counts 배열의 사용된 부분만 정렬

        int sum = 0;
        int cnt = 0;
        for (int i = index; i >= 0; i--) { // 내림차순 순회
            sum += counts[i];
            cnt++;
            if (sum >= k) break;
        }

        return cnt;
    }
}