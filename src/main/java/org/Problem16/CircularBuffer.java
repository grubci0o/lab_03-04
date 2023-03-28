package org.Problem16;

import java.util.ArrayList;
import java.util.List;

public class CircularBuffer {

    int maxSize;
    List<Integer> orders;
    int currentIdx;

    public CircularBuffer(int n){
        this.maxSize = n;
        this.orders = new ArrayList<>(n);
        this.currentIdx = 0;
    }


    public void record(int orderId){
        orders.add(currentIdx,orderId);
        currentIdx = (currentIdx + 1) % maxSize;
    }

    public int getLast(int i ){
        return orders.get((currentIdx + maxSize - i) % maxSize);
    }

}
