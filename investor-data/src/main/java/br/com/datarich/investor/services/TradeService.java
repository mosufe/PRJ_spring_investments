package br.com.datarich.investor.services;

import br.com.datarich.investor.models.Trade;

import java.time.ZonedDateTime;
import java.util.Set;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:23
 */
public interface TradeService extends CrudService<Trade, Long>{
    //TODO finish findByStock implementation
    Set<Trade> findByStock(String code);

    Set<Trade> findByUser(String name);

    Set<Trade> findByDate(ZonedDateTime time);
}
