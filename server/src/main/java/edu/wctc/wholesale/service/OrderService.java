package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Iterable<Order> getOrders() {
        return orderRepository.findAll();
    }
}