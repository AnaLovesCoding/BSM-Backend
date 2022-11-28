package com.bsm.backend.apis;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "cities")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class City {
    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "city_name")
    private String name;
}