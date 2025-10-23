package com.example.demo.service;

import com.example.demo.Repository.PaymentRepository;
import com.example.demo.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public Payment getPaymentDetails(Long paymentId) {
        return paymentRepository.findById(paymentId).get();
    }
}
