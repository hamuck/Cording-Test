import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        Deque<Integer> que = new LinkedList<>();
        
        for (int p : people) {
            que.add(p);
        }
        
        int answer = 0;
        
        while (!que.isEmpty()) {
            int heaviest = que.pollLast();
            if (!que.isEmpty() && heaviest + que.peekFirst() <= limit) {
                que.pollFirst();
            }
            answer++; // 보트 추가
        }
        
        return answer;
    }
}
