class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowsA = arr1.length;     
        int colsA = arr1[0].length;   
        int colsB = arr2[0].length;  

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {      
            for (int j = 0; j < colsB; j++) {    
                for (int k = 0; k < colsA; k++) { 
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }
}