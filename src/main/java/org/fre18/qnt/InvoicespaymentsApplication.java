package org.fre18.qnt;
 
import org.fre18.qnt.service.AccountsService;
import org.fre18.qnt.service.CustomersService;
import org.fre18.qnt.service.FinancialTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvoicespaymentsApplication  {

	@Autowired
	AccountsService accountsService;
	@Autowired
	private CustomersService customersService;
	@Autowired
	private FinancialTransactionsService financialTransactionsService;
	
	public static void main(String[] args) {
		SpringApplication.run(InvoicespaymentsApplication.class, args);
		
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(customersService.getOne(1)+" asdsads")	;
	}*/
}
