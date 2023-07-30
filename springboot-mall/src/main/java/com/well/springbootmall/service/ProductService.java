package com.well.springbootmall.service;

import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;


public interface ProductService {
    Product getProductById(Integer productId);
}
