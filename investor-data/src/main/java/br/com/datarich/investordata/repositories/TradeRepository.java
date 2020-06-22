package br.com.datarich.investordata.repositories;

import br.com.datarich.investordata.models.Trade;
import br.com.datarich.investordata.models.User;
import org.springframework.data.repository.CrudRepository;

import java.time.ZonedDateTime;
import java.util.Optional;

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
