package com.example.E_Commerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.Entity.OrderItem;
import com.example.E_Commerce.Repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
    OrderRepository orderRepository;

    
    public OrderItem addOrder(OrderItem order) {
        return orderRepository.save(order);
    }

    public List<OrderItem> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderItem getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderItem updateOrder(OrderItem order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}