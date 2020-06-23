package br.com.datarich.investordata.services.jpa;

import br.com.datarich.investordata.models.HistoricalData;
import br.com.datarich.investordata.models.User;
import br.com.datarich.investordata.repositories.HistoricalDataRepository;
import br.com.datarich.investordata.services.HistoricalDataService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class HistoricalDataJpaService implements HistoricalDataService {
    private final HistoricalDataRepository historicalDataRepository;

    public HistoricalDataJpaService(HistoricalDataRepository historicalDataRepository) {
        this.historicalDataRepository = historicalDataRepository;
    }

    @Override
    public Set<HistoricalData> findAll() {
        Set<HistoricalData> historicalDataSet = new HashSet<>();
        historicalDataRepository.findAll().forEach(historicalDataSet::add);
        return historicalDataSet;
    }

    @Override
    public HistoricalData findById(Long aLong) {
        return historicalDataRepository.findById(aLong).orElse(null);
    }

    @Override
    public HistoricalData save(HistoricalData object) {
        return historicalDataRepository.save(object);
    }

    @Override
    public void delete(HistoricalData object) {
        historicalDataRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        historicalDataRepository.deleteById(aLong);
    }
}

