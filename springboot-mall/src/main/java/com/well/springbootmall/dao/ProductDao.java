package com.well.springbootmall.dao;

import com.well.springbootmall.dto.ProductRequest;
import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
