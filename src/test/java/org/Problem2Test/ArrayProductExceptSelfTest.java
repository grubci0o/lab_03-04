package org.Problem2Test;

import org.Problem2.ArrayProductExceptSelf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayProductExceptSelfTest {

    @Test
    public void arrayWithNumbersTest(){
        int[] nums = new int[] {1,2,3,4,5};
        int[] numsExpectedResult = new int[] {120, 60, 40, 30, 24};
        ArrayProductExceptSelf sol = new ArrayProductExceptSelf();
        Assertions.assertArrayEquals(sol.solution(nums), numsExpectedResult);
    }


    @Test
    public void arrayWithNumbersAnotherTest(){
        int[] nums = new int[] {3,2,1};
        int[] numsExpectedResult = new int[] {2, 3, 6};
        ArrayProductExceptSelf sol = new ArrayProductExceptSelf();
        Assertions.assertArrayEquals(sol.solution(nums), numsExpectedResult);

    }
}
