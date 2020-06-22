package br.com.datarich.investordata.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.time.ZonedDateTime;
import java.util.Date;

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

    @Column(name = "tag_along")
    private String tagAlong;

    @Column(name = "segment")
    private String segment;

    @Column(name = "free_float")
    private float freeFloat;

}
