package br.com.datarich.investordata.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 14:40
 */

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity{

//    public User(Long id, String name, String surname, String email, Long phone) {
//        super(id);
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.phone = phone;
//    }

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    //TODO Add reference to Trade
}
