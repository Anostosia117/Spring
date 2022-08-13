package com.example.Spring.controller;

import com.example.Spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class ItemsController {
    @RestController
    @RequestMapping("/order")
    public class ItemController {
        private final OrderService orderService;

        public ItemController(OrderService orderService) {

            this.orderService = orderService;
        }

        @GetMapping("/add")
        List<Integer> addItems(@RequestParam List<Integer> ids) {
            return orderService.addItems(ids);
        }

        @GetMapping("/get")
        List<Integer> getItems() {
            return orderService.getItems();
        }
    }
}
