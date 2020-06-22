package br.com.datarich.investordata.repositories;

import br.com.datarich.investordata.models.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:40
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {

    Optional<Company> findByCountry();
    Optional<Company> findBySector();
    Optional<Company> findByCategory();
    Optional<Company> findBySize();

    //TODO Implement additional finds
}
