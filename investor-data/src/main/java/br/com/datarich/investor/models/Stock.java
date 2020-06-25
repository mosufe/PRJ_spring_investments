package br.com.datarich.investor.models;

import br.com.datarich.investor.models.enums.StockClassification;
import br.com.datarich.investor.models.enums.StockType;
import lombok.*;

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
@Builder
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

    @Column(name = "tag_along")
    private String tagAlong;

    @Column(name = "free_float")
    private float freeFloat;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stock")
    private Set<HistoricalData> historicalData = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
