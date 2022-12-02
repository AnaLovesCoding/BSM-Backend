package com.bsm.backend.apis;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "discounts")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Discount {
    @Id
    @Column(name = "discount_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long discountId;

    @Column(name = "percentage")
    private Long percentage;
}
