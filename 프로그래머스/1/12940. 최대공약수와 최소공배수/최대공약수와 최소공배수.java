import java.lang.Math;
class Solution {
    public int[] solution(int n, int m) {
        int x = Math.max(n,m);
        int y = Math.min(n,m);
        int[] answer = new int[2];
        int max = 1;
        for (int i = 1; i < x; i++){
            if(x % i == 0 && y % i == 0){
                max = i;
            }
        }
        answer[0] = max;
        answer[1] = x * y / max;
        
        return answer;
    }
}