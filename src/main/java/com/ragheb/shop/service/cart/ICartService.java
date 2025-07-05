package com.ragheb.shop.service.cart;

import com.ragheb.shop.model.Cart;
import com.ragheb.shop.model.User;

import java.math.BigDecimal;

public interface ICartService {

    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
