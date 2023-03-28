package org.Problem1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public boolean solution(int[] nums, int target) throws NullPointerException{
        //[1,3,5] target = 7

        if(nums == null){
            throw new NullPointerException("Array is null");
        }
        Map<Integer, Integer> values = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if (values.containsKey(diff)){
                return true;
            }
            values.put(nums[i],i);

        }
        return false;
    }
}
