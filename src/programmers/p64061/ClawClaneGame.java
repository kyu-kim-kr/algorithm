package programmers.p64061;

public class ClawClaneGame {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, //board[0]
                {0, 0, 1, 0, 3}, // board[1]
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Solution s = new Solution();
        s.solution(board, moves);
    }
}
