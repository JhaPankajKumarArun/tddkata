package tdd.acceptance;

public class AccountService {

	TransactionRepository transactionRepository;
	public AccountService(TransactionRepository transactionRepository){
		this.transactionRepository =transactionRepository;
	}
	
	public void deposit(int amount){
		Transaction transaction = new Transaction(amount,"07/30/2019",TransactionType.DEPOSIT);
		transactionRepository.save(transaction);
	}
	public void withdraw(int amount){
		Transaction transaction = new Transaction(amount,"07/30/2019",TransactionType.WITHDRAWL);
		transactionRepository.save(transaction);
	}
}
