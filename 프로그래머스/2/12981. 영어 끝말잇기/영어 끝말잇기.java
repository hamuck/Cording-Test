import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> usedWords = new HashSet<>();
        
        usedWords.add(words[0]);
        String beforeWord = words[0];

        for (int i = 1; i < words.length; i++) {
            int player = (i % n) + 1;

            if (usedWords.contains(words[i]) 
                || beforeWord.charAt(beforeWord.length() - 1) != words[i].charAt(0)) {
                int turn = (i / n) + 1;
                return new int[]{player, turn};
            }

            usedWords.add(words[i]);
            beforeWord = words[i];
        }

        return new int[]{0, 0};
    }
}