package com.example.E_Commerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.E_Commerce.Entity.OrderItem;
import com.example.E_Commerce.Service.OrderService;

@RestController
public class OrderController {
	
	
	
	@Autowired
	OrderService Orderserv;
	
	
	//AddOrder
	@PostMapping("/AddOrder")
	public OrderItem Addorder(@RequestBody OrderItem order) {
		return Orderserv.addOrder(order);
	}
	
	
	//GetAllOrder
	@GetMapping("/AllOrder")
	public List<OrderItem> GetallOrder(){
		return Orderserv.getAllOrders();
	}
	
	//GetByIdOrder
	@GetMapping("/GetOrder/{ID}")
	public OrderItem Getorder(@PathVariable Long id) {
		return Orderserv.getOrderById(id);
	} 
	
	
	//UpdateOrder
	@PutMapping("/Updateorder")
	public OrderItem Updateorder(@RequestBody OrderItem updateorder) {
		return Orderserv.updateOrder(updateorder);
	}
	
	//DeleteOrder
	@DeleteMapping("/DeleteOrder/{id}")
	public String deleteorder(@PathVariable Long id) {
		Orderserv.deleteOrder(id);
		return "Delete order successfull";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
