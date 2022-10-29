package sem3;
// https://leetcode.com/problems/n-queens/submissions/
import java.util.ArrayList;
import java.util.List;

public  class NQueens {
    public static void main(String[]args){
        Solution sol = new Solution();
        System.out.println(sol.solveNQueens(4));
        //sol.solveNQueens(4);
        }
}

class Solution {
    int[][] board;
    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        board = new int[n][n];
        backtrack(0);
        return ans;
    }

    private void backtrack(int col) {
        if (col == board.length) {
            addBoard();
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (canPlace(row, col)) {
                board[row][col] = 1;
                backtrack(col + 1);
                board[row][col] = 0;
            }
        }
    }

    private boolean canPlace(int i, int j) {
        // проверка прямо налево
        for (int col = j - 1; col >= 0; col--) {
            if (board[i][col] == 1) return false;
        }

        // проверка по диагонали влево вверх
        for (int row = i - 1, col = j - 1; row >= 0 && col >= 0; row--, col--) {
            if (board[row][col] == 1) return false;
        }

        // проверка по диагонали вниз вверх
        for (int row = i + 1, col = j - 1; row < board.length && col >= 0; row++, col--) {
            if (board[row][col] == 1) return false;
        }

        return true;
    }

    private void addBoard() {
        List<String> b = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    sb.append('.');
                } else {
                    sb.append('Q');
                }
            }

            b.add(sb.toString());
        }
        ans.add(b);
    }
}
