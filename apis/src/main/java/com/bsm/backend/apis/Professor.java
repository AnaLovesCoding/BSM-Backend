package com.bsm.backend.apis;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "professors")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
    @Id
    @Column(name = "bronco_id")
    private Long broncoId;

    @Column(name = "department")
    private String department;

    @Column(name = "office")
    private String office;

    @Column(name = "research")
    private String research;
}
