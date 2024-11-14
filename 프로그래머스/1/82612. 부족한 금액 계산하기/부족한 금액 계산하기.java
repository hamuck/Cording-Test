class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (long i = 1; i <= count; i++){
            answer += i * price;
        }
        
        if(answer < money){
            return 0;
        }else{
            return answer - money;
        }
    }
}