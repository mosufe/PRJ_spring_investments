package br.com.datarich.investordata.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
@Builder
public class Trade extends BaseEntity{

    @Column(name = "price")
    private Long price;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "time")
    private ZonedDateTime time;

    //TODO Add reference to Stock Entity
    //TODO Add reference to User
}

