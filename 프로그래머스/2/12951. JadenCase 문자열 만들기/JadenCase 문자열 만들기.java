class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.toLowerCase().split("");

        for (int i = 0; i < sArr.length; i++) {
            if (i == 0 || " ".equals(sArr[i - 1])) {
                sb.append(Character.toUpperCase(sArr[i].charAt(0)));
            } else {
                sb.append(sArr[i]);
            }
        }

        return sb.toString();
    }
}