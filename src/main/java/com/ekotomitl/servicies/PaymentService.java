package com.ekotomitl.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ekotomitl.models.Payment;
import com.ekotomitl.repositories.PaymentRepository;


@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;
	//GET TODOS
	public List<Payment> findAllPayment(){
		return paymentRepository.findAll();
	}
	//GET 
	public Optional<Payment> findPaymentById(Long id){
		return paymentRepository.findById(id);
	}
		
	//POST 
	public Payment savePayment(Payment payment) {
		return paymentRepository.save(payment);
	}
	
	//PUT
	public Payment replacePayment(Payment newPayment, Long id) {
		return paymentRepository.findById(id)
				.map(payment -> {
					payment.setPayment_date(newPayment.getPayment_date());
					payment.setAmount(newPayment.getAmount());
					payment.setStatus(newPayment.getStatus());
					return paymentRepository.save(payment);
				})
				.orElseGet(() -> {
					return paymentRepository.save(newPayment);
				});
	}
	//DELETE
	public void deletePaymentById(Long id) {
		paymentRepository.deleteById(id);
	}

}
