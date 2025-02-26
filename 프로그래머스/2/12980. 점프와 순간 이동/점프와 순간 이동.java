public class Solution {
    public int solution(int n) {
        int ans = 0;
        int length = 1;

        while (length * 2 <= n) {
            length *= 2;
        }

        while (n > 0) {
            if (n >= length) { 
                n -= length;
                ans++;
            }
            length /= 2;
        }

        return ans;
    }
}
