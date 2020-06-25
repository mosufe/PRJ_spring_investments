package br.com.datarich.investor.models;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "historical")
public class HistoricalData extends BaseEntity{
    @Column(name = "price")
    private Float price;

    @Column(name = "time")
    private ZonedDateTime time;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;
}

