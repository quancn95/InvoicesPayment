package com.fre18.qnt.model;
// Generated Sep 27, 2018 12:07:48 PM by Hibernate Tools 5.2.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Accounts generated by hbm2java
 */
@Entity
@Table(name = "accounts", catalog = "invoicespaymanents")
public class Accounts implements java.io.Serializable {

	private Integer accountId;
	private Customers customers;
	private Set<FinancialTransactions> financialTransactionses = new HashSet<FinancialTransactions>(0);

	public Accounts() {
	}

	public Accounts(Customers customers) {
		this.customers = customers;
	}

	public Accounts(Customers customers, Set<FinancialTransactions> financialTransactionses) {
		this.customers = customers;
		this.financialTransactionses = financialTransactionses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "account_id", unique = true, nullable = false)
	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accounts")
	public Set<FinancialTransactions> getFinancialTransactionses() {
		return this.financialTransactionses;
	}

	public void setFinancialTransactionses(Set<FinancialTransactions> financialTransactionses) {
		this.financialTransactionses = financialTransactionses;
	}

}
