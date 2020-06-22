package br.com.datarich.investordata.services;

import br.com.datarich.investordata.models.User;

import java.util.Optional;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 14:48
 */
public interface UserService extends CrudService<User, Long>{
    Optional<User> findBySurname(String surname);
}
