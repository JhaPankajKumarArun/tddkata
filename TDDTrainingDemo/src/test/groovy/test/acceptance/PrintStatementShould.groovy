package test.acceptance;

import static org.junit.Assert.*

import spock.lang.Specification
import tdd.acceptance.AccountService
import tdd.acceptance.ConsoleReader
import tdd.acceptance.TransactionRepository

class PrintStatementShould extends Specification{
	def ConsoleReader consoleReader=Mock();
	def TransactionRepository transactionRepository =Mock();
	def "print withdraw, deposit and balance" () {
		given:"an instance of AccountService and ConsoleReader"
			def AccountService accountService=new AccountService(transactionRepository);
			accountService.deposit(1000);
			accountService.deposit(100);
			accountService.withdraw(200);
		when:"accountservice is printing statement"
			accountService.printStatement();
		then:"print statement should reflect withdraw, deposit and balance in repository"
			with(consoleReader){	 
				1*consoleReader.printLn("DATE|AMOUNT|BALANCE")
				1*consoleReader.printLn("07/30/2019|-200|900")
				1*consoleReader.printLn("07/30/2019|100|1100")
				1*consoleReader.printLn("07/30/2019|1000|1000")
			}
	}
	

}
