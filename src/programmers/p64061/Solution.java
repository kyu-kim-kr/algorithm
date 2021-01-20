package programmers.p64061;

import java.util.ArrayList;

class Solution {
    int answer = 0;

    public int solution(int[][] board, int[] moves) {

        ArrayList<Integer> basket = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            int locationOfCrane = moves[i] - 1;
            for (int j = 0; j < board.length; j++) { //board.length 만큼 0이 안나오는곳까지 try.
                if (board[j][locationOfCrane] != 0) {
                    basket.add(board[j][locationOfCrane]);
                    board[j][locationOfCrane] = 0;

                    checkDuplicates(basket);

                    break;
                }
            }
        }

        return answer;
    }

    private void checkDuplicates(ArrayList<Integer> MovedDolls) {

        for (int i = 0; i < MovedDolls.size(); i++) {
            if (i + 1 == MovedDolls.size()) {
                break;
            }
            if (MovedDolls.get(i) == MovedDolls.get(i + 1)) {
                answer += 2;
                MovedDolls.remove(i);
                MovedDolls.remove(i);
                i--; //remove하면 사이즈가 줄어드니까 다음 비교대상의 인덱스가 줄어들게된다 그래서 i--;
            }
        }
    }
}