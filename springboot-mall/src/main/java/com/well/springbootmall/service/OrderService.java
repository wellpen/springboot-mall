package com.well.springbootmall.service;

import com.well.springbootmall.dto.CreateOrderRequest;
import com.well.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
