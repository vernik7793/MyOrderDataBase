package com.MyOrderDataBase.repository;

import java.time.LocalDate;

import com.MyOrderDataBase.entity.Order;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class
})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderRepositoryTest {

    Logger LOG = LoggerFactory.getLogger(OrderRepositoryTest.class);

    @Autowired
    private IOrderRepository orderRepository;

    Long id = 1L;
    String client = "Ivanov Ivan Ivanovich";
    String address = "Rostov-on-Don";
    LocalDate orderDate = LocalDate.now();

    @Test
    public void a_create_order() {
        LOG.info("test create order by code {}", client, address, orderDate);

        Order order = new Order(client, address, orderDate);

        orderRepository.save(order);

        Assert.assertEquals(order.getId() != null, true);
    }

    @Test
    public void b_find_order() {
        LOG.info("test find order by id {}", id);

        Order order = orderRepository.findById(id);

        Assert.assertEquals(order.getId(), id);
    }

    @Test
    public void c_update_order() {
        LOG.info("test update order by id {}", id);

        Order order = orderRepository.findById(id);
        order.setClient("Petrov Petr Petrovich");
        orderRepository.save(order);

        order = orderRepository.findById(id);

        Assert.assertEquals(order.getClient(), "Petrov Petr Petrovich");
    }

    @Test
    public void d_remove_order() {
        LOG.info("test remove order by id {}", id);

        Order order = orderRepository.findById(id);

        orderRepository.delete(order);
    }
}