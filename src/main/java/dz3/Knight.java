package dz3;

import java.util.Arrays;

public class Knight {

    public static void main(String[]args){
        int N = 5;
        int pos = 1;
        int[][] board = new int[N][N];
        backtrack(N, board, 0, 0, pos);
    }
    private static void backtrack(int N, int[][] board, int x, int y, int pos) {
        board[x][y] = pos;

        if (pos >= N*N) {
            System.out.println("Решение");
            print(board);
            board[x][y] = 0;
            return;
        }
        int[] moveX = { 2, 1, -1, -2, -2, -1, 1, 2, 2 };
        int[] moveY = { 1, 2, 2, 1, -1, -2, -2, -1, -1 };

        for (int k = 0; k < 8; k++) {
            int newX = x + moveX[k];
            int newY = y + moveY[k];

            if (canPlace(newX, newY, N) && board[newX][newY] == 0) {
                backtrack(N, board, newX, newY, pos + 1);
            }
        }
        board[x][y] = 0;
    }

    private static boolean canPlace(int x, int y, int N) {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }
        return true;
    }

    private static void print(int[][] array) {
        for (int[] item : array) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println();
    }
}
