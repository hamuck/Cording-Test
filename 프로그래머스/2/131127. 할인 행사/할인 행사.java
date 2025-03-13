import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Set<String> wantSet = new HashSet<>(Arrays.asList(want)); // WANT와 NUMBER를 셋에 넣기
        int answer = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) { // 처음 FOR문: DISCOUNT-10이 0이 될 때까지
            Map<String, Integer> map = new HashMap<>();
            int cnt = 0;
            
            for (int j = i; j < i + 10; j++) { // 두번째 FOR문: 시작 지점부터 10일간 순회
                String item = discount[j];
                if (wantSet.contains(item)) { // 키가 존재할 시 CNT++
                    map.put(item, map.getOrDefault(item, 0) + 1);
                    cnt++;
                }
            }
            
            boolean isValid = true;
            for (int k = 0; k < want.length; k++) {
                if (map.getOrDefault(want[k], 0) < number[k]) { // 원하는 수량 충족 확인
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) answer++; // 조건 충족 시 ANSWER++
        }
        
        return answer;
    }
}
    
    //1.WANT와 NUMBER를 셋에 넣는다.
    //2.DISCOUNT를 순회하는 FOR문 생성, 이때 이중FOR문을 돌린다. 
    //3.처음 FOR문은 DISCOUNT-10이 0이 될때까지
    //4.두번째 FOR문은 처음 FOR문에서 받아오는 시작 지점부터 DISCOUNT를 순회
    //5.키가 존재할시 CNT++
    //6.키가 존재하지않는 시점에서 만약 CNT가 10 이상이라면 ANSWER++, 10이하라면 그대로 BREAK
    //7.ANSWER return