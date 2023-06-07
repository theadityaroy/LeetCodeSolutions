// 867. Transpose Matrix : https://leetcode.com/problems/transpose-matrix/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[][] res = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                res[i][j] = matrix[j][i];
            }  
        }
        return res;
    }
}

// Time Complexity : O(M*N)