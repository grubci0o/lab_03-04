package org.Problem4;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) throws NullPointerException{

        if (nums == null){
            throw new NullPointerException("Array cannot be null");
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (1 <= val && val < nums.length + 1) {
                if (nums[val - 1] > 0) {
                    nums[val - 1] *= -1;
                } else if (nums[val - 1] == 0) {
                    nums[val - 1] = -1 * (nums.length + 1);
                }
            }

        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }

        }
        return nums.length + 1;


    }
}
