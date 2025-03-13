import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>(); // WANT와 NUMBER를 맵에 넣기
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) { // 처음 FOR문: DISCOUNT-10이 0이 될 때까지
            Map<String, Integer> tempMap = new HashMap<>(wantMap); // 원본 맵을 복사
            int cnt = 0;
            
            for (int j = i; j < i + 10; j++) { // 두번째 FOR문: 시작 지점부터 10일간 순회
                String item = discount[j];
                if (tempMap.containsKey(item) && tempMap.get(item) > 0) { // 키가 존재할 시 CNT++ 및 값 감소
                    tempMap.put(item, tempMap.get(item) - 1);
                    cnt++;
                }
            }
            
            if (cnt >= 10) answer++; // CNT가 10 이상이면 ANSWER++
        }
        
        return answer;
    }
}
    
    //1.WANT와 NUMBER를 셋에 넣는다.
    //2.DISCOUNT를 순회하는 FOR문 생성, 이때 이중FOR문을 돌린다. 
    //3.처음 FOR문은 DISCOUNT-10이 0이 될때까지
    //4.두번째 FOR문은 처음 FOR문에서 받아오는 시작 지점부터 DISCOUNT를 순회
    //5.키가 존재할시 CNT++, 키의 값을 --
    //6.키가 존재하지않는 시점에서 만약 CNT가 10 이상이라면 ANSWER++, 10이하라면 그대로 BREAK
    //7.ANSWER return