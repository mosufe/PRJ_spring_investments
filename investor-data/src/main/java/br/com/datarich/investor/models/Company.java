package br.com.datarich.investor.models;

import br.com.datarich.investor.models.enums.CompanySize;
import br.com.datarich.investor.models.enums.Origin;
import br.com.datarich.investor.models.enums.Sector;
import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:33
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "companies")
public class Company extends BaseEntity{

    @Column(name = "brand")
    private String brand;

    @Column(name = "fantasy_name")
    private String fantasyName;

    @Column(name = "website")
    private String Website;

    @Lob
    @Column(name = "logo")
    private byte[] logo;

    @Column(name = "market_value")
    private Long marketValue;

    @Column(name = "listed_employees")
    private Long listedEmployees;

    @Column(name = "foundation")
    private ZonedDateTime foundation;

    @Column(name = "ipo")
    private Date ipo;

    @Enumerated(value = EnumType.STRING)
    private CompanySize companySize;

    @Enumerated(value = EnumType.STRING)
    private Origin origin;

    @Enumerated(value = EnumType.STRING)
    private Sector sector;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "company")
    private Set<Stock> stocks = new HashSet<>();

}
