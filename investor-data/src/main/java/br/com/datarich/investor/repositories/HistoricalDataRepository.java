package br.com.datarich.investor.repositories;

import br.com.datarich.investor.models.HistoricalData;
import org.springframework.data.repository.CrudRepository;

public interface HistoricalDataRepository extends CrudRepository<HistoricalData, Long> {
}
