package br.com.datarich.investordata.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "historical_data")
@Entity
public class HistoricalData extends BaseEntity{
    @Column(name = "price")
    private Long price;

    @Column(name = "time")
    private ZonedDateTime time;
}
