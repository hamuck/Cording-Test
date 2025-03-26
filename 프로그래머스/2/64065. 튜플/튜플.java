import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String s1 = s.substring(2, s.length() - 2);
        String arr[] = s1.split("\\},\\{");
        
        List<Set<Integer>> setList = new ArrayList<>();
        for (String set : arr){
            String elements[] = set.split(",");
            Set<Integer> setElements = new HashSet<>();
            for (String element : elements){
                setElements.add(Integer.parseInt(element));
            }
            setList.add(setElements);
        }
        
        Collections.sort(setList, (a, b) -> a.size() - b.size());
        
        List<Integer> tuple = new ArrayList<>();
        Set<Integer> tupleSet = new HashSet<>();
        
        for (Set<Integer> currentSet : setList){
            for (Integer element : currentSet){
                if(!tupleSet.contains(element)){
                    tuple.add(element);
                    tupleSet.add(element);
                    break;
                }
            }
        }
        return tuple.stream().mapToInt(Integer::intValue).toArray();
    }
}