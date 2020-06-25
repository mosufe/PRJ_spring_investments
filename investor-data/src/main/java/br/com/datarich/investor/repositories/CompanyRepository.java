package br.com.datarich.investor.repositories;

import br.com.datarich.investor.models.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:40
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {

    //Optional<Company> findByCountry();
    //Optional<Company> findBySector();
    //Optional<Company> findByCategory();
    //Optional<Company> findBySize();

    //TODO Implement additional finds
}
