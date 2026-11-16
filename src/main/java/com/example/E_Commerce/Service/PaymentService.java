package com.example.E_Commerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.Entity.Payment;
import com.example.E_Commerce.Repository.PaymentRepository;

@Service
public class PaymentService {
	
	
	    @Autowired
	    PaymentRepository paymentRepo;

	   
	    public Payment addPayment(Payment payment) {
	        return paymentRepo.save(payment);
	    }

	    public List<Payment> getAllPayments() {
	        return paymentRepo.findAll();
	    }

	    public Optional<Payment> getPaymentById(Long id) {
	        return paymentRepo.findById(id);
	    }

	    public Payment updatePayment(Payment payment) {
	        return paymentRepo.save(payment);
	    }

	    public void deletePayment(Long id) {
	    	paymentRepo.deleteById(id);
	    }
	}
	
	
	


