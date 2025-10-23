package com.example.demo.service;

import com.example.demo.entity.Payment;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    public Payment getPaymentDetails(Long paymentId);
}
