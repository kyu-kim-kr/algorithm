package programmers.p64061;

public class ClawClaneGame {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 1, 0, 0, 0}, //board[0]
                {0, 2, 0, 3, 0, 5}, // board[1]
                {0, 0, 0, 4, 0, 5},
                {0, 4, 0, 3, 0, 0},
                {1, 0, 5, 0, 6, 0},
                {0, 0, 0, 7, 0, 0}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4, 5, 6, 1, 3, 5, 6};

        Solution s = new Solution();
        s.solution(board, moves);
    }
}
