import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<Integer> players = new ArrayList<>();
        Set<String> usedWords = new HashSet<>();
        
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }

        usedWords.add(words[0]);
        String beforeWord = words[0];

        for (int i = 1; i < words.length; i++) {
            int player = players.get(i % n);

            if (usedWords.contains(words[i]) 
                || beforeWord.charAt(beforeWord.length() - 1) != words[i].charAt(0)) {
                int turn = (i / n) + 1; // 몇 번째 차례인지 계산
                return new int[]{player, turn};
            }

            usedWords.add(words[i]);
            beforeWord = words[i];
        }

        return new int[]{0, 0};
    }
}