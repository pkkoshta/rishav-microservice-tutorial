package com.prashant.controller;

import com.prashant.dto.ProductDTO;
import com.prashant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/api")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create/order")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO){
        return orderService.createProduct(productDTO);
    }
}
