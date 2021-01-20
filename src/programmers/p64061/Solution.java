package programmers.p64061;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    ArrayList<Integer> MovedDolls = new ArrayList<>();

    public int solution(int[][] board, int[] moves) {

        int answer;
        return answer;
    }

    private void move(int[][] board, int[] moves) {

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {

                int lastIndex = board.length-(j+1); //temp의 마지막인덱스
                if (board[moves[i] - 1][lastIndex] != 0) {
                    int caughtDoll = board[moves[i] - 1][lastIndex];
                    MovedDolls.add(caughtDoll);
                    board[moves[i] - 1][lastIndex] = 0; // 옮긴걸 0으로바꾸면 다음엔 안집겠네
                    break; //옮겨다 집어넣으면 다음 move.
                }
            }

        }
    }
}
