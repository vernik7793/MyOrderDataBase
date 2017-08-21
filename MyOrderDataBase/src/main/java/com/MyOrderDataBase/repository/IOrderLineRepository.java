package com.MyOrderDataBase.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.MyOrderDataBase.entity.OrderLine;

public interface IOrderLineRepository extends Repository<OrderLine, Long> {
    List<OrderLine> listOrderLines();
    OrderLine findById(Long id);
    OrderLine save(OrderLine orderLine);
    void delete(OrderLine orderLine);
}