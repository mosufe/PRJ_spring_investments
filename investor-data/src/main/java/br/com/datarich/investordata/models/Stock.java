package br.com.datarich.investordata.models;

import br.com.datarich.investordata.models.enums.StockClassification;
import br.com.datarich.investordata.models.enums.StockType;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:25
 *
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

    @Enumerated(value = EnumType.STRING)
    private StockClassification stockClassification;

    @Enumerated(value = EnumType.STRING)
    private StockType stockType;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<HistoricalData> historicalData = new HashSet<>();

    @ManyToOne
    private Company company;
}
