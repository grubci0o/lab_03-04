package org.Problem2;

public class ArrayProductExceptSelf {

    public int[] solution(int[] nums){
        int[] sol = new int [nums.length];
        int postfix = 1;
        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            sol[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--){
            sol[i] *= postfix;
            postfix *= nums[i];
        }
        return sol;

    }
}
