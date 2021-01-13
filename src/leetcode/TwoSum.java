package leetcode;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        /**
         * 0 + 1 , 0 + 2 , 0 + 3
         * 1 + 2 , 1 + 3
         * 2 + 3
         */
        int[] answer = new int[2];

        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            count--;
            for (int j = 0; j < count; j++) {
                if (i <= j) {
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
}
