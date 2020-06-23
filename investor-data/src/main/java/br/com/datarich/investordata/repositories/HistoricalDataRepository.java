package br.com.datarich.investordata.repositories;

import br.com.datarich.investordata.models.HistoricalData;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalDataRepository extends CrudRepository<HistoricalData, Long> {
}
