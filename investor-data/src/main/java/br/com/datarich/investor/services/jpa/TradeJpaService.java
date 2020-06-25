package br.com.datarich.investor.services.jpa;

import br.com.datarich.investor.models.Trade;
import br.com.datarich.investor.repositories.StockRepository;
import br.com.datarich.investor.repositories.TradeRepository;
import br.com.datarich.investor.services.TradeService;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Service
public class TradeJpaService implements TradeService {

    private final TradeRepository tradeRepository;
    private final StockRepository stockRepository;

    public TradeJpaService(TradeRepository tradeRepository, StockRepository stockRepository) {
        this.tradeRepository = tradeRepository;
        this.stockRepository = stockRepository;
    }

    @Override
    public Set<Trade> findAll() {
        Set<Trade> trades = new HashSet<>();
        tradeRepository.findAll().forEach(trades::add);
        return trades;
    }

    @Override
    public Trade findById(Long aLong) {
        return tradeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Trade save(Trade object) {
        return tradeRepository.save(object);
    }

    @Override
    public void delete(Trade object) {

    }

    @Override
    public void deleteById(Long aLong) {
        tradeRepository.deleteById(aLong);
    }

    @Override
    public Set<Trade> findByStock(String code) {
        Set<Trade> trades = (Set<Trade>) tradeRepository.findAll();
        trades.stream().filter(t -> t.getStock().getCode().equals(code));
        return trades;
    }

    @Override
    public Set<Trade> findByUser(String name) {
        Set<Trade> trades = (Set<Trade>) tradeRepository.findAll();
        trades.stream().filter(t -> t.getUser().getName().equals(name));
        return trades;
    }

    @Override
    public Set<Trade> findByDate(ZonedDateTime time) {
        Set<Trade> trades = new HashSet<>();
        return trades;
    }

    //TODO change find ByDateImplementation
}
