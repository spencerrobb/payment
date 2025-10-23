package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name ="payment_date")
    private Date paymentDt;


}
