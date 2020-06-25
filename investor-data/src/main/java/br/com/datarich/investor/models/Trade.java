package br.com.datarich.investor.models;

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
@Builder
@Table(name = "trades")
public class Trade extends BaseEntity{

    @Column(name = "price")
    private Float price;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;

}

