package com.example.Spring.service;

import com.example.Spring.component.Cart;

import java.util.List;

public class OrderServiceImpl implements OrderService{
    private final Cart cart;
    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }
    @Override
    public List<Integer> addItems(List<Integer> idList) {
        return cart.addItems(idList);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
