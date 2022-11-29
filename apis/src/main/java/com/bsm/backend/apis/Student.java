package com.bsm.backend.apis;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "students")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "bronco_id")
    private Long broncoId;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "grad_date")
    private Date gradDate;

    @Column(name = "major")
    private String major;

    @Column(name = "minor")
    private String minor;
}
