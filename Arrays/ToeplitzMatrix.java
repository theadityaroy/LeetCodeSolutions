// 766. Toeplitz Matrix : https://leetcode.com/problems/toeplitz-matrix/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length * matrix[0].length < 4){
            return true;
        }
        for(int i = 1; i < matrix.length; i++){
            for(int j = 1; j < matrix[i].length; j++){
                if(matrix[i-1][j-1] != matrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

// Time Complexity : O(M*N)