package com.example.Spring.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Integer> addItems(List<Integer> idList);
    List<Integer> getItems();
}
