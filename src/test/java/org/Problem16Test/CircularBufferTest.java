package org.Problem16Test;

import org.Problem16.CircularBuffer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircularBufferTest {

    @Test
    public void circularBufferTest(){
        CircularBuffer circularBuffer = new CircularBuffer(5);
        circularBuffer.record(12);
        circularBuffer.record(123);
        circularBuffer.record(1234);
        circularBuffer.record(12345);
        circularBuffer.record(123456);
        int thirdOrder = circularBuffer.getLast(3);
        Assertions.assertEquals(thirdOrder,1234 );

    }

    @Test
    public void addMoreRecordsThanMaxSize(){
        CircularBuffer circularBuffer = new CircularBuffer(5);
        circularBuffer.record(12);
        circularBuffer.record(123);
        circularBuffer.record(1234);
        circularBuffer.record(12345);
        circularBuffer.record(123456);
        circularBuffer.record(1234567);
        int lastOrder = circularBuffer.getLast(1);
        Assertions.assertEquals(lastOrder, 1234567);
    }
}
