package com.well.springbootmall.dao;

import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;

@Component
public interface ProductDao {

    Product getProductById(Integer productId);

}
