package com.well.springbootmall.service.impl;

import com.well.springbootmall.dao.ProductDao;
import com.well.springbootmall.model.Product;
import com.well.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);

    }
}
