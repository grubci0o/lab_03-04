package org.Problem2;

public class Main {
    public static void main(String[] args){
        ArrayProductExceptSelf sol = new ArrayProductExceptSelf();
        int[] nums = new int[] {1,2,3,4,5};
        int[] numsExpectedResult = new int[] {120, 60, 40, 30, 24};
        int[] nums_new = sol.solution(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums_new[i]);
        }
    }
}
