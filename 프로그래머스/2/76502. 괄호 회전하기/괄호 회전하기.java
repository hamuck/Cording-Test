import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();

        // 1. 문자열을 큐에 넣기
        for (char c : s.toCharArray()) {
            queue.offer(c);
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {
            // 2. 올바른 괄호 문자열인지 확인
            if (isValid(queue)) {
                answer++;
            }

            // 3. 왼쪽 회전 (첫 번째 문자를 꺼내서 뒤로 보냄)
            queue.offer(queue.poll());
        }

        return answer;
    }
  private boolean isValid(Queue<Character> queue) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketMap = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );

        for (char c : queue) {  // 큐의 내용을 그대로 검사
            if (bracketMap.containsKey(c)) {  // 닫는 괄호인지 확인
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            } else {  // 여는 괄호라면 스택에 추가
                stack.push(c);
            }
        }
        return stack.isEmpty();  // 스택이 비어 있으면 올바른 괄호 문자열
    }
}
