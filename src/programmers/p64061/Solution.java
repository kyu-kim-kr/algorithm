package programmers.p64061;

import java.util.ArrayList;

public class Solution {

    ArrayList<Integer> MovedDolls = new ArrayList<>();
    int count = 0;

    public int solution(int[][] board, int[] moves) {
        moveDolls(board, moves);
        return count;
    }

    private void moveDolls(int[][] board, int[] moves) {

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {

                int lastIndex = board.length-(j+1);
                if (board[moves[i] - 1][lastIndex] != 0) {
                    int caughtDoll = board[moves[i] - 1][lastIndex];
                    MovedDolls.add(caughtDoll);
                    board[moves[i] - 1][lastIndex] = 0;

                    checkDuplicates(MovedDolls);

                    break;
                }
            }

        }
    }

    private void checkDuplicates(ArrayList<Integer> basket) {

        for (int i = 0; i < basket.size(); i++) {
            if (i + 1 == basket.size()) {
                break;
            }
            if (basket.get(i) == basket.get(i + 1)) {
                count += 2;
                basket.remove(i);
                basket.remove(i);
                i--; //remove하면 사이즈가 줄어드니까 다음 비교대상의 인덱스가 줄어들게된다 그래서 i--;
            }
        }
    }
}