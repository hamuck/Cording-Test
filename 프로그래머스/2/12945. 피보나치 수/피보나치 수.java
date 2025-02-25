class Solution {
    public int solution(int n) {
        int answer = fibonacci(n);
        return answer;
    }
    
    private int fibonacci(int n){
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1234567;
            a = b;
            b = result;
        }
        return result;
    }
}