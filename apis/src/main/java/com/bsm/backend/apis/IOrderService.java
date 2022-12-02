package com.bsm.backend.apis;

import java.util.List;

public interface IOrderService {
    List<Orders> findAllOrders();

    Orders findOrdersById(long orderId);

    Orders saveOrder(Orders orders);

    Orders deleteOrder(Orders orders);
}
