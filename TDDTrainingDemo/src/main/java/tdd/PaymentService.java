package tdd;

public class PaymentService {
	UserValidator userValidator;
	PaymentGateway paymentGateway;
		public PaymentService(UserValidator userValidator, PaymentGateway paymentGateway){
			this.userValidator= userValidator;
			this.paymentGateway= paymentGateway;	
			
		}
	public void processPayment(User user, PaymentDetails paymentDetails) throws Exception{
		if(!userValidator.validateUser(user)){
			throw new UserNotValidatedException("User is invalid");
		}
		if(!paymentGateway.processPayment(paymentDetails)){
			throw new PaymentProcessFailedException();
		}		 
	}
}
