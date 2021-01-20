package programmers.p42840;

import java.util.Arrays;

class Solution {

    int[] a = {1, 2, 3, 4, 5};
    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public int[] solution(int[] answers) {

        int A = countOfAnswers(answers, a);
        int B = countOfAnswers(answers, b);
        int C = countOfAnswers(answers, c);

        int[] arr = new int[0];
        if (A == B && B == C && A == C) {
            arr = new int[]{1, 2, 3};
        }
        
        if (A == B && A != C && B != C) {
            arr = new int[]{1, 2};
        }
        
        if (B == C && A != B && A != C) {
            arr = new int[]{2, 3};
        }
        
        if (A != B && A != C && B != C) {
            arr = new int[]{A, B, C};
            Arrays.sort(arr);
            if (arr[0] == A) {
                arr = new int[]{1};
            }
            if (arr[0] == B) {
                arr = new int[]{2};
            }
            if (arr[0] == C) {
                arr = new int[]{3};
            }
            
        }
        return arr;
      
    }
    private int countOfAnswers(int[] answers, int[] givenAnswer){

        int count1 = 0;
        int countOfAnswers = 0;
        for (int i = 0; i < answers.length; i++) {
            if (i != 0) {
                count1++;
            }
            if (i % givenAnswer.length == 0) {
                count1 = 0;
            }
            if ( answers[i] == givenAnswer[count1]) {
                countOfAnswers++;
            }
        }
        return countOfAnswers;
    }
}
