import java.util.*;

class Solution {
    public String solution(String s) {
        String[] list = s.split(" ",-1);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < list[i].length(); j++) {
                char c = list[i].charAt(j);
                if (j % 2 == 0 || j == 0) {
                    word.append(Character.toUpperCase(c));
                } else {
                    word.append(Character.toLowerCase(c));
                }
            }
            result.append(word);
            if (i < list.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
