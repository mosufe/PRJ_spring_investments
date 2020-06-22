package br.com.datarich.investordata.repositories;

import br.com.datarich.investordata.models.Stock;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Guilherme Jacome de Paula
 * Date 22/06/2020
 * Time 15:29
 */
public interface StockRepository extends CrudRepository<Stock, Long> {

}
