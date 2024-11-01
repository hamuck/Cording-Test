class Solution {
    public String solution(String s) {
        String[] list = s.split("");
        int size = list.length;
        String answer = "";
        if (size % 2 == 0){
            int num = size / 2;
            answer += list[num-1];
            answer += list[num];
        }
        else{
            int num = size/2;
            answer = list[num];
        }
        return answer;
    }
}