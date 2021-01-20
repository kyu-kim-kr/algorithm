package programmers.p64061;

import java.util.ArrayList;

public class Solution {

    ArrayList<Integer> MovedDolls = new ArrayList<>();
    int count = 0;

    public void solution(int[][] board, int[] moves) {
        moveDolls(board, moves);
        System.out.println(count);
    }

    private void moveDolls(int[][] board, int[] moves) {

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {

                int lastIndex = board.length-(j+1); //temp의 마지막인덱스
                if (board[moves[i] - 1][lastIndex] != 0) {
                    int caughtDoll = board[moves[i] - 1][lastIndex];
                    MovedDolls.add(caughtDoll);
                    board[moves[i] - 1][lastIndex] = 0; //옮긴걸 0으로바꾸면 다음엔 안집겠네

                    checkDuplicates(MovedDolls);


                    break; //옮겨다 집어넣으면 다음 move.
                }
            }

        }
    }

    private void checkDuplicates(ArrayList<Integer> MovedDolls) {

        for (int i = 0; i < MovedDolls.size(); i++) {
            if (i + 1 == MovedDolls.size()) {
                break;
            }
            if (MovedDolls.get(i) == MovedDolls.get(i + 1)) {
                count += 2;
                MovedDolls.remove(i); // 여기서 length가 2가되고
                MovedDolls.remove(i); // 여기서 또 지우려니까  length가 2인데 어떻게지우냐 이말이네?
                i--; //remove하면 사이즈가 줄어드니까 다음 비교대상의 인덱스가 줄어들게된다 그래서 i--;
            }
        }
    }
}
