package org.Problem4Test;

import org.Problem4.FirstMissingPositive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstMissingPositiveTest {

    @Test
    public void arrayWithNumbers(){
        FirstMissingPositive sol = new FirstMissingPositive();
        int[] nums = new int[] {3,4,-1,1};
        Assertions.assertEquals(sol.firstMissingPositive(nums),2);
    }

    @Test
    public void secondArrayWithNumbers(){
        var sol = new FirstMissingPositive();
        int[] nums = new int[] {1,2,0};
        Assertions.assertEquals(sol.firstMissingPositive(nums),3);
    }

    @Test
    public void nullArrayThrowException() throws NullPointerException{
        FirstMissingPositive sol = new FirstMissingPositive();
        int[] nums = null;
        Assertions.assertThrows(NullPointerException.class,() -> sol.firstMissingPositive(nums));

    }

}
