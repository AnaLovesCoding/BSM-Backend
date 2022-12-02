package com.bsm.backend.apis.product;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "current_price")
    private Long currentPrice;
}
