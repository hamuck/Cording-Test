import java.util.ArrayList;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> numberList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                numberList.add(i);
            }
        } 
        
        for (int i : numberList){
            answer += i;
        }
        
        return answer;
    }
}