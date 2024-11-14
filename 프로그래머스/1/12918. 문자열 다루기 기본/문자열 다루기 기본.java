class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            try{
            int number = Integer.parseInt(s);
            }
            catch (NumberFormatException ex){
            answer = false;
            }
        }else{
            answer = false;
        }

        return answer;
    }
}