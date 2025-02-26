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
            int weight = que.pollLast();
            if (!que.isEmpty() && weight + que.peekFirst() <= limit) {
                que.pollFirst();
            }
            answer++;
        }
        
        return answer;
    }
}
