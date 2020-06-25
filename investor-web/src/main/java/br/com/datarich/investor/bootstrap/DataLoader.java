package br.com.datarich.investor.bootstrap;

import br.com.datarich.investor.models.*;
import br.com.datarich.investor.models.enums.*;
import br.com.datarich.investor.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.swing.text.Segment;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Component
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

        Company petrobras = new Company();
        petrobras.setBrand("Petrobras");
        petrobras.setFantasyName("Companhia de Petroleo Brasileira");
        petrobras.setWebsite("http://petrobras.com.br");
        petrobras.setLogo(new byte[0]);
        petrobras.setMarketValue(200000000L);
        petrobras.setListedEmployees(62829L);
        petrobras.setFoundation(ZonedDateTime.now().minusYears(60));
        petrobras.setIpo(new Date());
        petrobras.setTagAlong("80");
        petrobras.setFreeFloat(30.0f);
        petrobras.setCompanySize(CompanySize.LARGECAP);
        petrobras.setOrigin(Origin.BRAZIL);
        petrobras.setSector(Sector.OIL);

        Company itau = new Company();
        itau.setBrand("ITAU");
        itau.setFantasyName("Itau Unibanco SA");
        itau.setWebsite("http://itau.com.br");
        itau.setLogo(new byte[0]);
        itau.setMarketValue(200000000L);
        itau.setListedEmployees(62829L);
        itau.setFoundation(ZonedDateTime.now().minusYears(50));
        itau.setIpo(new Date());
        itau.setTagAlong("80");
        itau.setFreeFloat(30.0f);
        itau.setCompanySize(CompanySize.LARGECAP);
        itau.setOrigin(Origin.BRAZIL);
        itau.setSector(Sector.FINANCIAL);

        Company persistedPetrobras = companyRepository.save(petrobras);
        Company persistedItau = companyRepository.save(itau);
        System.out.println("Companies saved - Total: " + companyRepository.count());

        HistoricalData itub3Hist = new HistoricalData();
        itub3Hist.setPrice(18.33f);
        itub3Hist.setTime(ZonedDateTime.now());

        HistoricalData petr4Hist = new HistoricalData();
        petr4Hist.setPrice(23f);
        petr4Hist.setTime(ZonedDateTime.now().minusMinutes(30));

        HistoricalData SavedItub3Hist = historicalDataRepository.save(itub3Hist);
        HistoricalData SavedPetr4Hist = historicalDataRepository.save(petr4Hist);
        System.out.println("Historical Data saved - Total: " + historicalDataRepository.count());

        Stock itub3 = new Stock();
        itub3.setCode("ITUB3");
        itub3.setCompany(persistedItau);
        itub3.setCurrentYield("1234");
        itub3.setStockClassification(StockClassification.STOCK);
        itub3.setStockType(StockType.COMMON);
        //itub3.getHistoricalData().add(itub3Hist);

        Stock petr4 = new Stock();
        petr4.setCode("PETR4");
        petr4.setCompany(persistedPetrobras);
        petr4.setCurrentYield("1234");
        petr4.setStockClassification(StockClassification.STOCK);
        petr4.setStockType(StockType.PREFERRED);
        //petr4.getHistoricalData().add(petr4Hist);

        Stock petr3 = new Stock();
        petr3.setCode("PETR3");
        petr3.setCompany(persistedPetrobras);
        petr3.setCurrentYield("1234");
        petr3.setStockClassification(StockClassification.STOCK);
        petr3.setStockType(StockType.COMMON);

        Stock savedItub3 = stockRepository.save(itub3);
        Stock savedPetr4 =  stockRepository.save(petr4);
        Stock savedPetr3 = stockRepository.save(petr3);
        System.out.println("Stocks saved - Total: " + stockRepository.count());


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

        User savedLaura = userRepository.save(laura);
        User savedGuilherme = userRepository.save(guilherme);
        System.out.println("Users saved - Total: " + userRepository.count());

        Trade lauraTrade = new Trade();
        lauraTrade.setAmount(100L);
        lauraTrade.setPrice(23.3f);
        lauraTrade.setStock(savedPetr4);
        lauraTrade.setUser(savedLaura);

        Trade guiTrade = new Trade();
        guiTrade.setAmount(200L);
        guiTrade.setPrice(18.3f);
        guiTrade.setStock(savedItub3);
        guiTrade.setUser(savedGuilherme);

        tradeRepository.save(guiTrade);
        tradeRepository.save(lauraTrade);
        System.out.println("Trades saved - Total: " + tradeRepository.count());

        //loadData();
    }

    private void loadData() {

    }
}
