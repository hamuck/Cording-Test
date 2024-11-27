class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long intp = Long.parseLong(p);
        int num = p.length();

        for (int i = 0; i <= t.length() - num; i++) { 
            long num2 = Long.parseLong(t.substring(i, i + num)); 
            if (num2 <= intp) {
                answer++;
            }
        }

        return answer;
    }
}
