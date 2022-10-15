package com.example.transactionanaliticservice.data.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class TransactionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number_from")
    private String cardNumberFrom;

    @Column(name = "card_number_to")
    private String cardNumberTo;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "is_success")
    private Boolean isSuccess;

    @Column(name = "date")
    private Timestamp date;

}
