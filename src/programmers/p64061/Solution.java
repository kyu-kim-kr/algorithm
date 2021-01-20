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
        /**
         * moves[i] 이 무슨 숫자인지 본다
         * 그 숫자의 값을 -1한다.
         * -1 한 값을 board에 행에 넣는다
         * 예) board[moves[i]-1]
         *
         * board[moves[i]-1][board.length-1] 부터
         * board[moves[i]-1][board.length-2]
         * board[moves[i]-1][board.length-3]
         * ... 까지
         * board의 열 부분이 0이 될떄까지 검사하는 for문을 만든다
         *
         * 그 검사한 인덱스의 값을 새로운 배열에 넣는다.
         * 인덱스의 값이 0이면 넣지 않고 다음 인덱스 값을 검사한다
         *
         */

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {

                // int[] -> ArrayList<Integer>
                ArrayList<Integer> temp = Arrays.stream(board[moves[i] - 1])
                        .boxed()
                        .collect(Collectors.toCollection(ArrayList::new));

                if (temp.get(temp.size()-j+1) != 0) {
                    int caughtIndex = temp.size()-j+1;
                    int caughtDoll = temp.get(caughtIndex);
                    temp.remove(caughtIndex);
                    MovedDolls.add(caughtDoll);
                }
            }


//                  0이 아니면 MovedDolls에 넣었지만 다음번에 체크했을때 똑같은 인덱스의
//                  값이 들어와서 다른방식으로..
//                if (board[moves[i] - 1][board.length - j + 1] != 0) {
//                    int caughtDoll;
//                    caughtDoll = board[moves[i] - 1][board.length - j + 1];
//                    MovedDolls.add(caughtDoll);
//                    break;
//        }
                    /**
                     * 집어넣은 caughtDoll은 다음엔 체크안하도록 해야한다.
                     * ArrayList에 board[i]의 값을 다 넣고
                     * 체크한거까지 remove하는 방식으로 하면 괜찮으려나?
                     */

        }
    }
}
