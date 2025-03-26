import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{i, priorities[i]});
            pq.add(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            int[] element = queue.poll();
            int index = element[0];
            int priority = element[1];
            
            if(priority == pq.peek()){
                answer++;
                pq.poll();
                
                if(index == location){
                    break;
                }
            }else{
                queue.add(element);
            }
        }
        return answer;
    }
}
