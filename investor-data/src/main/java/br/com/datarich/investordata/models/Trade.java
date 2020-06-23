package br.com.datarich.investordata.models;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:12
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trades")
public class Trade extends BaseEntity{

    @Column(name = "price")
    private Long price;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    private User user;

    @ManyToOne
    private Stock stock;

}

