package com.prashant.service.impl;

import com.prashant.dto.ProductDTO;
import com.prashant.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private RestTemplate restTemplate;



    @Override
    public ProductDTO create(ProductDTO product) {
        HttpEntity<ProductDTO> entity = new HttpEntity<>(product);
        ResponseEntity<ProductDTO> exchange = restTemplate.exchange("http://order-service/order/api/create/order", HttpMethod.POST, entity, ProductDTO.class);
        return exchange.getBody();
    }

}
