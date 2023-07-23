package com.mycompany.prameswara.store.services;

import java.util.List;

import com.mycompany.prameswara.store.enteties.Order;

public interface OrderManagementService {

    void addOrder(Order order);

    List<Order> getOrdersByUserId(int userId);

    List<Order> getOrders();

}
