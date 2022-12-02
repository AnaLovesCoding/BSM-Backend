package com.bsm.backend.apis.order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {
    private final OrderRepository repository;
    @Override
    public List<Orders> findAllOrders() {
        return repository.findAll();
    }

    @Override
    public Orders findOrdersById(long orderId) {
        return repository.findById(orderId).orElseGet(null);
    }

    @Override
    public Orders saveOrder(Orders orders) {
        return repository.save(orders);
    }

    @Override
    public Orders deleteOrder(Orders orders) {
        repository.delete(orders);
        return orders;
    }
}
