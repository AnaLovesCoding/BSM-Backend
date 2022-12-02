package com.bsm.backend.apis.storeadmin;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "store_admin")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StoreAdmin {
    @Id
    @Column(name = "bronco_id")
    private Long broncoId;

    @Column(name = "start_date")
    private Date startDate;
}
