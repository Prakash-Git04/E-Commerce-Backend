package com.example.E_Commerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.E_Commerce.Entity.Payment;
import com.example.E_Commerce.Service.PaymentService;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentServ;

    // Add Payment
    @PostMapping("/addpay")
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentServ.addPayment(payment);
    }

    // Get All Payments
    @GetMapping("/Getallpay")
    public List<Payment> getAllPayments() {
        return paymentServ.getAllPayments();
    }

    // Get Payment By ID
    @GetMapping("GetPay/{id}")
    public Optional<Payment> getPaymentById(@PathVariable Long id) {
        return paymentServ.getPaymentById(id);
    }

    // Update Payment
    @PutMapping("/updatPay")
    public Payment updatePayment(@RequestBody Payment payment) {
        return paymentServ.updatePayment(payment);
    }

    // Delete Payment
    @DeleteMapping("/deletePay/{id}")
    public String deletePayment(@PathVariable Long id) {
    	paymentServ.deletePayment(id);
        return "Payment deleted successfully";
    
    }
}