import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 0;
        for (int i=0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer.add(arr[i]);
                cnt++;
                System.out.println(answer);
            }
    }
        
        if(answer.isEmpty()){
            answer.clear();
            answer.add(-1);
        }
        Collections.sort(answer);
        return answer;
    }
}