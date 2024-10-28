class Solution {
    public long solution(long num) {
        long count = 0;
        long answer = 0;
        while (num != 1){
            if (num % 2 == 0 && count < 500){
                num = num/2 ;
                count++;
                System.out.println(count+"와"+num);
            }else if(count >= 500){
                count = -1;
                break;
            }else{
                num = num*3+1;
                count++;
                System.out.println(count+"와"+num);
            }
        }
        
        return count;
    }
}