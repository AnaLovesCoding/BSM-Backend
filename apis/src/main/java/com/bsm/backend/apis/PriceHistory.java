package com.bsm.backend.apis;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "price_history")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceHistory {
    @Id
    @Column(name = "price_history_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long priceHistoryId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "price")
    private Long price;

    @Column(name = "timestamp")
    private Date timestamp;
}
