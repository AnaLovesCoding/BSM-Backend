package com.bsm.backend.apis;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    protected String street;
    protected Integer number;
    protected String city;
    protected String state;
    protected Integer zip;
}
