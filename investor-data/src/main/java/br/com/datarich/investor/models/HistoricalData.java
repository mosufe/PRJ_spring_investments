package br.com.datarich.investor.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.ZonedDateTime;

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
}
