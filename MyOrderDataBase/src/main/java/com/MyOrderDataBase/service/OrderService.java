package com.MyOrderDataBase.service;

import com.MyOrderDataBase.entity.Order;
import com.MyOrderDataBase.repository.IOrderRepository;

import java.util.List;

public interface OrderService {
    /*void addOrder(IOrderRepository orderRepository);
    void updateOrder(IOrderRepository orderRepository);
    void removeOrder(int id);
    IOrderRepository getOrderById(int id);*/
    List<Order> listOrders();
}