package test.acceptance;

import static org.junit.Assert.*

import spock.lang.Specification
import tdd.acceptance.AccountService
import tdd.acceptance.Transaction
import tdd.acceptance.TransactionRepository
import tdd.acceptance.TransactionType

class AccountServiceShould extends Specification{
	def TransactionRepository transactionRepository =Mock();
	def "deposit the given amount into account"(){ 
		given:"amount to deposit"
			def amount =100;
			def Transaction transaction = new Transaction(100,'07/30/2019',TransactionType.DEPOSIT);
			def AccountService accountservice= new AccountService(transactionRepository);
			 
		when:"amount is deposited"
			accountservice.deposit(amount);
		then:"amount is commited in repository"
			1*transactionRepository.save(transaction);
	}

	def "withdraw the given amount from account"(){
		given:"amount to withdrawl"
			def amount =100;
			def Transaction transaction = new Transaction(100,'07/30/2019',TransactionType.WITHDRAWL);
			def AccountService accountservice= new AccountService(transactionRepository);
			 
		when:"amount is withdrawn"
			accountservice.withdraw(amount);
		then:"amount is commited in repository"
			1*transactionRepository.save(transaction);
	}
	
}
