package com.well.springbootmall.dao;

import com.well.springbootmall.constant.ProductCategory;
import com.well.springbootmall.dto.ProductQueryParams;
import com.well.springbootmall.dto.ProductRequest;
import com.well.springbootmall.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId,ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
