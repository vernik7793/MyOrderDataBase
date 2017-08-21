package com.MyOrderDataBase.service;

import com.MyOrderDataBase.entity.Order;
import com.MyOrderDataBase.repository.IOrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private IOrderRepository orderRepository;

    public  void setOrderRepository(IOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
/*
    @Override
    public void addOrder(IOrderRepository o) {
        this.orderRepository.addNote(note);
    }

    @Override
    public void updateOrder(IOrderRepository note) {
        this.orderRepository.updateNote(note);
    }

    @Override
    public void removeOrder(int id) {
        this.orderRepository.removeNote(id);
    }

    @Override
    public IOrderRepository getOrderById(int id) {
        return this.orderRepository.getBookById(id);
    }
*/
    @Override
    public List<Order> listOrders() {
        return this.orderRepository.listOrders();
    }
}