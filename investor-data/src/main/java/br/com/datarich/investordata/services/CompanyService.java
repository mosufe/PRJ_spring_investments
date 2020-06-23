package br.com.datarich.investordata.services;

import br.com.datarich.investordata.models.Company;
import br.com.datarich.investordata.models.enums.CompanySize;
import br.com.datarich.investordata.models.enums.Origin;
import br.com.datarich.investordata.models.enums.Sector;
import br.com.datarich.investordata.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:38
 */
public interface CompanyService extends CrudService<Company, Long> {

    Set<Company> findByCountry(Origin origin);
    Set<Company> findBySector(Sector sector);
    Set<Company> findBySize(CompanySize size);

    //TODO Implement additional finds
}
