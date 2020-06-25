package br.com.datarich.investor.repositories;

import br.com.datarich.investor.models.Trade;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:21
 */
public interface TradeRepository extends CrudRepository<Trade, Long> {

    //TODO finish findByStock implementation
    //Optional<Trade> findByStock();

    //Optional<Trade> findByUser(User user);

    //Optional<Trade> findByDate(ZonedDateTime time);
}
