// 999. Available Captures for Rook : https://leetcode.com/problems/available-captures-for-rook/

class Solution {
    public int numRookCaptures(char[][] board) {
        int m = 0;
        int n = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'R'){
                    m = i;
                    n = j;
                    break;
                }
            }
        }
        
        int count = 0;

        for(int i = m; i>=0; i--){
            if(board[i][n] == 'p'){
                count++;
                break;
            }
            else if(board[i][n] == 'B'){
                break;
            }
        }

        for(int i = m; i < 8; i++){
            if(board[i][n] == 'p'){
                count++;
                break;
            }
            else if(board[i][n] == 'B'){
                break;
            }
        }

        for(int j = n; j>=0; j--){
            if(board[m][j] == 'p'){
                count++;
                break;
            }
            else if(board[m][j] == 'B'){
                break;
            }
        }

        for(int j = n; j < 8; j++){
            if(board[m][j] == 'p'){
                count++;
                break;
            }
            else if(board[m][j] == 'B'){
                break;
            }
        }

        return count;
    }
}

// Time Complexity : O(1)