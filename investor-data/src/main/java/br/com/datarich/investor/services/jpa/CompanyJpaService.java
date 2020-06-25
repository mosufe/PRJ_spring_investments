package br.com.datarich.investor.services.jpa;

import br.com.datarich.investor.models.Company;
import br.com.datarich.investor.models.enums.CompanySize;
import br.com.datarich.investor.models.enums.Origin;
import br.com.datarich.investor.models.enums.Sector;
import br.com.datarich.investor.repositories.CompanyRepository;
import br.com.datarich.investor.services.CompanyService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CompanyJpaService implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyJpaService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public Set<Company> findAll() {
        Set<Company> companies = new HashSet<>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    @Override
    public Company findById(Long aLong) {
        return companyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Company save(Company object) {
        return companyRepository.save(object);
    }

    @Override
    public void delete(Company object) {
        companyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        companyRepository.deleteById(aLong);
    }

    @Override
    public Set<Company> findByCountry(Origin origin) {
        Set<Company> companies = (Set<Company>) companyRepository.findAll();
        companies.stream().filter(c -> c.getOrigin().equals(origin));
        return companies;
    }

    @Override
    public Set<Company> findBySector(Sector sector) {
        Set<Company> companies = (Set<Company>) companyRepository.findAll();
        companies.stream().filter(c -> c.getSector().equals(sector));
        return companies;
    }

    @Override
    public Set<Company> findBySize(CompanySize size) {
        Set<Company> companies = (Set<Company>) companyRepository.findAll();
        companies.stream().filter(c -> c.getCompanySize().equals(size));
        return companies;
    }
}
