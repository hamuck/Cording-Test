class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String input = String.valueOf(x);
        int[] list = new int[input.length()];
        int sum = 0;
        
        for (int i = 0; i < list.length; i++){
            sum += Integer.parseInt(input.charAt(i)+"");
        }
        
        if (x % sum == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}