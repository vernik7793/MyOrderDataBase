package com.MyOrderDataBase.entity;

import org.junit.Assert;
import org.junit.Test;

import com.MyOrderDataBase.entity.OrderLine;

public class OrderLineTest {

    @Test
    public void new_orderLine() {
        try {
            new OrderLine(null, null, null,null);
            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }
}