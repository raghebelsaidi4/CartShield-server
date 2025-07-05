package com.ragheb.shop.service.order;

import com.ragheb.shop.dto.OrderDto;
import com.ragheb.shop.model.Order;

import java.util.List;

public interface IOrderService {

    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}


