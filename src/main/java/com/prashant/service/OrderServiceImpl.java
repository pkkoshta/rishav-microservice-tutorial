package com.prashant.service;

import com.prashant.dto.ProductDTO;
import com.prashant.entity.Product;
import com.prashant.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
         productRepo.save(product);
         return productDTO;
    }
}
