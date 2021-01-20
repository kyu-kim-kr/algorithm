package programmers.p64061;

import java.util.ArrayList;

public class Solution {

    ArrayList<Integer> MovedDolls = new ArrayList<>();

    public void solution(int[][] board, int[] moves) {
        moveDolls(board, moves);
        System.out.println(checkDuplicates());
    }
ㅇ
    private void moveDolls(int[][] board, int[] moves) {

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
        System.out.println(MovedDolls);
    }

    private int checkDuplicates() {
        int count = 0;

        for (int i = 0; i < MovedDolls.size(); i++ ) {
            if (i+1 == MovedDolls.size()) {
                break;
            }
            if (MovedDolls.get(i) == MovedDolls.get(i+1) ) {
                count += 2;
                i++;
            }

        }

        return count;
    }
}
