package com.example.demo.controller;

import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/hello")
    public String hello (){
        return "hello World";
    }

    @GetMapping("/{paymentId}")
    public Payment getPaymentDetails(@PathVariable Long paymentId){
        return paymentService.getPaymentDetails(paymentId);
    }
}
