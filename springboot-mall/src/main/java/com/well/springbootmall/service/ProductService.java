package com.well.springbootmall.service;


import com.well.springbootmall.dto.ProductQueryParams;
import com.well.springbootmall.dto.ProductRequest;
import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId,ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
