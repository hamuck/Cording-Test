import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];
        for (int i : arr){
            list.add(i);
            if (i < min){
                min = i;
            }else if(arr.length==1){
                list.add(-1);
            }
        }
        list.remove(Integer.valueOf(min));
        System.out.println(min);
            return list;
}
}