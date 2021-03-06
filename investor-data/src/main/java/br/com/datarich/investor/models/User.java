package br.com.datarich.investor.models;

import br.com.datarich.investor.models.enums.Origin;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 14:40
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users")
public class User extends BaseEntity{

    public User(Long id, String name, String surname, String email, Long phone) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private Long phone;

    @Enumerated(value = EnumType.STRING)
    private Origin country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Trade> trade = new HashSet<>();
}
