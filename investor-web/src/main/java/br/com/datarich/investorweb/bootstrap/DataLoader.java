package br.com.datarich.investorweb.bootstrap;

import br.com.datarich.investordata.models.*;
import br.com.datarich.investordata.models.enums.*;
import br.com.datarich.investordata.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements CommandLineRunner {


    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;
    private final TradeRepository tradeRepository;
    private final StockRepository stockRepository;
    private final HistoricalDataRepository historicalDataRepository;

    public DataLoader(UserRepository userRepository, CompanyRepository companyRepository, TradeRepository tradeRepository, StockRepository stockRepository, HistoricalDataRepository historicalDataRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
        this.tradeRepository = tradeRepository;
        this.stockRepository = stockRepository;
        this.historicalDataRepository = historicalDataRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User laura = new User();
        laura.setName("Laura");
        laura.setSurname("Cunha Barbosa");
        laura.setCountry(Origin.BRAZIL);
        laura.setEmail("lauradrcb@yahoo.com.br");
        laura.setPhone(1324214454435L);

        User guilherme = new User();
        guilherme.setName("Guilherme");
        guilherme.setSurname("Jacome de Paula");
        guilherme.setCountry(Origin.BRAZIL);
        guilherme.setEmail("guilhermejp4@gmail.com");
        guilherme.setPhone(324334243233L);

        userRepository.save(laura);
        userRepository.save(guilherme);

        System.out.println("Users saved");
        System.out.println(userRepository.count());

        //loadData();
    }

    private void loadData(){

    }
}
