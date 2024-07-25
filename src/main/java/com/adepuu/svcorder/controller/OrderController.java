package com.adepuu.svcorder.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @PostMapping("/create")
    public String createOrder() {
        return "Order created successfully";
    }
}
