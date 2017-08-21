package com.MyOrderDataBase.entity;

import org.springframework.util.Assert;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;


@Entity(name = "ORDER_TABEL")
@Table(name = "ORDER_TABEL")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String client;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalDate orderDate;

    @OneToMany(orphanRemoval=true)
    @JoinColumn(name="ID_ORDER")
    private List<OrderLine> orderLines = new LinkedList<>();

    public Order() {}
    public Order(String client, String address, LocalDate orderDate) {
        Assert.hasText(client, "client can not be empty or null!");
        Assert.hasText(address, "address can not be empty or null!");
        Assert.hasText(orderDate.toString(), "orderDate can not be empty or null!");
        this.client = client;
        this.address = address;
        this.orderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String code) {
        this.address = address;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date date) {
        this.orderDate = orderDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public void orderLinesClear() {
        orderLines.clear();
    }

    public void addOrderLine(OrderLine orderLine) {
        if (this.orderLines == null) {
            orderLines = new LinkedList<OrderLine>();
        }
        this.orderLines.add(orderLine);
    }

    public void addOrderLines(List<OrderLine> orderLines) {
        this.orderLines.addAll(orderLines);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}