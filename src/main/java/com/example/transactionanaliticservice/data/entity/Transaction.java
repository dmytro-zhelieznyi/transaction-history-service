package com.example.transactionanaliticservice.data.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Transaction {

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

    // TODO check why postgres Timestamp is shorter than java LocalDateTime
    @EqualsAndHashCode.Exclude
    @Column(name = "date")
    private LocalDateTime date;

}
