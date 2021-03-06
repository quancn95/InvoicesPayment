/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.service;


import java.util.List;

import javax.transaction.Transactional;

import org.fre18.qnt.entity.Invoices;
import org.fre18.qnt.repository.InvoicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InvoicesServiceImpl implements InvoicesService {

	@Autowired
	private InvoicesRepository invoicesRepository;

	@Override
	public Invoices getOne(Integer invoiceNumber) {
		return invoicesRepository.getOne(invoiceNumber);
	}

	@Override
	public Boolean delete(Integer invoiceNumber) {
		if (invoicesRepository.getOne(invoiceNumber) != null) {
			invoicesRepository.deleteById(invoiceNumber);
			return true;
		}
		return false;
	}

	@Override
	public Invoices create(Invoices invoices) {
		return invoicesRepository.save(invoices);
	}

	@Override
	public Invoices update(Invoices invoicesToUpdate) {
						Invoices invoices = invoicesRepository.getOne(invoicesToUpdate.getInvoiceNumber());
										
//				if(invoicesToUpdate.getBookingId() !=null) {
//			
//		}
				return invoicesRepository.save(invoices);
	}

	@Override
	public Boolean exist(Invoices invoices) {
						return invoicesRepository.existsById(invoices.getInvoiceNumber());
									}

	@Override
	public List<Invoices> findAll() {
		return invoicesRepository.findAll();
	}

}

