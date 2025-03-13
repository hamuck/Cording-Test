import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);  // 필요한 크기만큼 배열 생성
        int[] answer = new int[size];

        for (long idx = left; idx <= right; idx++) {
            int row = (int) (idx / n);  // 행 번호
            int col = (int) (idx % n);  // 열 번호
            answer[(int) (idx - left)] = Math.max(row, col) + 1;  // 해당 값 계산
        }

        return answer;
    }
}

        //n번째 -> [n / i]  [(n%i)], 값이 0이라면 i 
        //7번째 -> [7 / 3] [7 % 3 , 0 == 3]
