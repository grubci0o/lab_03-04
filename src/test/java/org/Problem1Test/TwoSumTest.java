package org.Problem1Test;

import org.Problem1.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumTest {

    @Test
    public void arrayWithTenandSeventeenTest(){
        TwoSum s1 = new TwoSum();
        int[] nums = new int[] {10,15,3,7};
        int target = 17;
        Assertions.assertTrue(s1.solution(nums, target));

    }

    @Test
    public void nullArrayTest() throws NullPointerException{
        TwoSum s1 = new TwoSum();
        int[] nums = null;
        int target = 17;
        assertThrows(NullPointerException.class,() -> s1.solution(nums,target));

    }

    @Test
    public void arrayWithZeroes(){
        TwoSum s1 = new TwoSum();
        int[] nums = new int[] {0,0,0};
        int target = 1;
        Assertions.assertFalse(s1.solution(nums, target));
    }
}
