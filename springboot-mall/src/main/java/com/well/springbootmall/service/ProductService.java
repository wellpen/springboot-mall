package com.well.springbootmall.service;

import com.well.springbootmall.dto.ProductRequest;
import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;


public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
}
