package com.ragheb.shop.service.cart;

import com.ragheb.shop.model.Cart;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Long initializeNewCart();

    //Cart getCartByUserId(Long userId);
}
