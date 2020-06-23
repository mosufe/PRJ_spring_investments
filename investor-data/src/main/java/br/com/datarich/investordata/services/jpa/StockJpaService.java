package br.com.datarich.investordata.services.jpa;

import br.com.datarich.investordata.models.Stock;
import br.com.datarich.investordata.models.User;
import br.com.datarich.investordata.repositories.StockRepository;
import br.com.datarich.investordata.services.StockService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class StockJpaService implements StockService {
    private final StockRepository stockRepository;

    public StockJpaService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    @Override
    public Set<Stock> findAll() {
        Set<Stock> stocks = new HashSet<>();
        stockRepository.findAll().forEach(stocks::add);
        return stocks;
    }

    @Override
    public Stock findById(Long aLong) {
        return stockRepository.findById(aLong).orElse(null);
    }

    @Override
    public Stock save(Stock object) {
        return stockRepository.save(object);
    }

    @Override
    public void delete(Stock object) {
        stockRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        stockRepository.deleteById(aLong);
    }
}
