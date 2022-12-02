package com.bsm.backend.apis.order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {
    private final IOrderService orderService;

    @GetMapping("")
    public List<Orders> findAllOrders() {
        return orderService.findAllOrders();
    }

    @GetMapping("/{orderId}")
    public Orders findStoreAdminById(@PathVariable long orderId) {
        return orderService.findOrdersById(orderId);
    }

    @PostMapping("")
    public Orders saveOrder(@RequestBody Orders orders) {
        return orderService.saveOrder(orders);
    }

    @DeleteMapping("")
    public Orders deleteOrder(@RequestBody Orders orders) {
        return orderService.deleteOrder(orders);
    }
}
