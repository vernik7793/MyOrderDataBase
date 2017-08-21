package com.MyOrderDataBase.entity;

import org.junit.Assert;
import org.junit.Test;

import com.MyOrderDataBase.entity.Order;

import java.time.LocalDate;

public class OrderTest {

    @Test
    public void new_order() {
        try {
            new Order(null, null, null);
            Assert.fail();
        } catch (IllegalArgumentException e) {

        }
    }
}