package br.com.datarich.investordata.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:25
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stocks")
public class Stock extends BaseEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "yield")
    private String currentYield;

    //TODO Add reference to Trade
    //TODO Add reference to Company
    //TODO Add reference to Enum StockCategory
    //TODO Add reference to Enum StockType
    //TODO Add reference to Company
    //TODO Add reference to HistoricalData
}
