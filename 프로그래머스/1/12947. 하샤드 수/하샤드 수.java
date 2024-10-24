class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String input = String.valueOf(x);
        int[] list = new int[input.length()];
        int sum = 0;
        
        for (int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(input.charAt(i)+"");
            sum += list[i];
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