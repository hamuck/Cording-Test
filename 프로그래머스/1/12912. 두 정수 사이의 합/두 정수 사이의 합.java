class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b){
            int num = a;
            a = b;
            b = num;
        }
            
        for(int i = a; i <= b; i++){
            answer += i;
    

    }
                return answer;
}
}