/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 11:32:05 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package org.fre18.qnt.repository;

import org.fre18.qnt.entity.FinancialTransactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for FinancialTransactions.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface FinancialTransactionsRepository  extends JpaRepository<FinancialTransactions, Integer> {}