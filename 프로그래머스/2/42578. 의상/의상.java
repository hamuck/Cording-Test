import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();
        for (String[] cloth : clothes) {
            String category = cloth[1];
            clothesMap.put(category, clothesMap.getOrDefault(category, 0) + 1);
        }
        int answer = 1;
        for (int count : clothesMap.values()) {
            answer *= (count + 1);
        }

        return answer - 1; // 아무것도 입지 않는 경우 제외
    }
}