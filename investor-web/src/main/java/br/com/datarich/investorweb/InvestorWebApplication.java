package br.com.datarich.investorweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.datarich.investordata")
@EntityScan("br.com.datarich.investordata")
public class InvestorWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestorWebApplication.class, args);
	}

}
