package tdd;

public class PaymentProcessFailedException extends Exception {
	public PaymentProcessFailedException(){
		super("Payment is failed");
	}
}
