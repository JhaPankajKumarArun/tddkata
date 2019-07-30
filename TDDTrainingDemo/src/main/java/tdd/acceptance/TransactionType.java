package tdd.acceptance;

public enum TransactionType {
	DEPOSIT("1"),
	WITHDRAWL("2");
	
	private String status;

	TransactionType(String status){
		this.status=status;
	}
	
}
