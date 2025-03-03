import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        
        int max = arr[arr.length - 1];
        int min = arr[0];
        int multiple = max * min;

        while (true) {
            boolean isTrue = true;
            for (int num : arr) {
                if (multiple % num != 0) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                return multiple;
            }
            multiple++;
        }
    }
}