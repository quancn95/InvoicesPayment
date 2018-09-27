package org.fre18.qnt;

import org.fre18.qnt.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoicespaymentsApplication implements CommandLineRunner{

	@Autowired
	AccountsService accountsService;
	
	public static void main(String[] args) {
		SpringApplication.run(InvoicespaymentsApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(accountsService.getOne(1)+" asdsads")	;
	}
}
