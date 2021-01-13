package leetcode;

import java.util.Arrays;

class TwoSum {
    public static int[] twoSum ( int[] nums, int target){
        /**
         * 0 + 1 , 0 + 2 , 0 + 3
         * 1 + 2 , 1 + 3
         * 2 + 3
         */
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= j) {
                    continue;
                }
                if (target == nums[i] + nums[j]) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }

            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4, 6}, 6)));
        /**
         * 문제1
         * new로 바로 인트배열만들었는데빨간줄
         * 문제2
         * 저렇게안하고 변수에 배열담아서 출력했는데 메모리 주소가 나옴
         */
    }
}

