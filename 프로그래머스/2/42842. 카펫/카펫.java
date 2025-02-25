class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];

        for (int width = 3; width <= total; width++) {
            if (total % width == 0) {
                int height = total / width;

                if ((width - 2) * (height - 2) == yellow) {
                    answer[1] = width;
                    answer[0] = height;
                    break;
                }
            }
        }

        return answer;
    }
}
