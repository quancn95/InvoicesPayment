/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.service;


import java.util.List;

import javax.transaction.Transactional;

import org.fre18.qnt.entity.TransactionTypes;
import org.fre18.qnt.repository.TransactionTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionTypesServiceImpl implements TransactionTypesService {

	@Autowired
	private TransactionTypesRepository transactionTypesRepository;

	@Override
	public TransactionTypes getOne(Integer transactionTypeCode) {
		return transactionTypesRepository.getOne(transactionTypeCode);
	}

	@Override
	public Boolean delete(Integer transactionTypeCode) {
		if (transactionTypesRepository.getOne(transactionTypeCode) != null) {
			transactionTypesRepository.deleteById(transactionTypeCode);
			return true;
		}
		return false;
	}

	@Override
	public TransactionTypes create(TransactionTypes transactionTypes) {
		return transactionTypesRepository.save(transactionTypes);
	}

	@Override
	public TransactionTypes update(TransactionTypes transactionTypesToUpdate) {
						TransactionTypes transactionTypes = transactionTypesRepository.getOne(transactionTypesToUpdate.getTransactionTypeCode());
						
				return transactionTypesRepository.save(transactionTypes);
	}

	@Override
	public Boolean exist(TransactionTypes transactionTypes) {
						return transactionTypesRepository.existsById(transactionTypes.getTransactionTypeCode());
					}

	@Override
	public List<TransactionTypes> findAll() {
		return transactionTypesRepository.findAll();
	}

}

