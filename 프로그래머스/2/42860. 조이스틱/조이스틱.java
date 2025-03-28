import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        String[] alphabet = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N",
            "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        HashMap<String, Integer> alphabetHash = new HashMap<>();
        
        for (int i = 0; i < alphabet.length; i++) {
            if (i < 14) {
                alphabetHash.put(alphabet[i], i);
            } else {
                alphabetHash.put(alphabet[i], alphabet.length - i);
            }
        }
        
        int length = name.length();
        int move = length - 1;
        
        for (int i = 0; i < length; i++) {
            answer += alphabetHash.get(String.valueOf(name.charAt(i)));
            
            // A가 연속된 부분 찾기
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(move, i * 2 + length - next);
            move = Math.min(move, (length - next) * 2 + i);
        }
        
        return answer + move;
    }
}
