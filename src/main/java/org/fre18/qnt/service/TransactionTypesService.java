/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.service;

import java.util.List;

import org.fre18.qnt.entity.TransactionTypes;

public interface TransactionTypesService {

	public TransactionTypes getOne(Integer transactionTypeCode);

	public List<TransactionTypes> findAll();

	public Boolean delete(Integer transactionTypeCode);

	public TransactionTypes create(TransactionTypes transactionTypes);

	public TransactionTypes update(TransactionTypes transactionTypes);

	public Boolean exist(TransactionTypes transactionTypes);
}
