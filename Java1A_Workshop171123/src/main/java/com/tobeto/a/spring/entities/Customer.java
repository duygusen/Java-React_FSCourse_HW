package com.tobeto.a.spring.entities;

import jakarta.persistence.*;

import java.util.List;
@Table(name="customers")
@Entity
public class Customer
{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="age")
    private int age;

    @Column(name="phone")
    private int phone;

    @Column(name="adress")
    private String adress;

    @OneToMany(mappedBy = "customer")
    private List<Car> cars;

    @ManyToOne
    @JoinColumn(name="payment_id")
    private Payment payment;

}
