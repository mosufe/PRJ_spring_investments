package br.com.datarich.investor.repositories;

import br.com.datarich.investor.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 14:45
 */

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findBySurname(String surname);
}
