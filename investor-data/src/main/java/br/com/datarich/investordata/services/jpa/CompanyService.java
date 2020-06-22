package br.com.datarich.investordata.services.jpa;

import br.com.datarich.investordata.models.Company;
import br.com.datarich.investordata.services.CrudService;

import java.util.Optional;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:38
 */
public interface CompanyService extends CrudService<Company, Long> {

    Optional<Company> findByCountry();
    Optional<Company> findBySector();
    Optional<Company> findByCategory();
    Optional<Company> findBySize();

    //TODO Implement additional finds
}
