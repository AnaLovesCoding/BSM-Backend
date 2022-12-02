package com.bsm.backend.apis.order;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "orders")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "date_time")
    private Date orderDate;

    @Column(name = "total_price")
    private Long total_price;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "discount_id")
    private Long discountId;

    @Column(name = "order_status")
    private String orderStatus;


}
