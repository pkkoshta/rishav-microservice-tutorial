package com.prashant.controller;

import com.prashant.dto.ProductDTO;
import com.prashant.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/api")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/save")
    public ProductDTO createProduct(@RequestBody ProductDTO product){
        return productService.create(product);
    }

//    @GetMapping("/byName/{name}")
//    public Product findByName(@PathVariable String name){
//        return productService.productName(name);
//    }
}
