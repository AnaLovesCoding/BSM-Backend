package com.bsm.backend.apis.user;

import com.bsm.backend.apis.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "bsm_users")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name = "bronco_id")
    private Long broncoId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "phone")
    private int phone;

    @Embedded
    private Address address;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "user_types")
//    private BsmUserType[] userTypes;
}
