package test;

import static org.junit.Assert.*

import spock.lang.Specification
import tdd.PaymentDetails
import tdd.PaymentGateway
import tdd.PaymentService
import tdd.User
import tdd.UserNotValidatedException
import tdd.UserValidator

class PaymentServiceShould extends Specification{
	def UserValidator uservalidator = Mock()
	def PaymentGateway paymentGateway = Mock()
	private PaymentService paymentService;
	def setup(){
	   paymentService = new PaymentService(uservalidator,paymentGateway) 
	}
   
	def "process payment when user is not valid" (){
		given:"an instance of user and paymentdetails paymentService"
			def User user= new User();
			def paymentdetails= new PaymentDetails()
			uservalidator.validateUser(user)>> false 
		when:"user and paymentdetails instance is provided"
			paymentService.processPayment(user,paymentdetails);
		then:"" 
			def error= thrown(UserNotValidatedException)
			error.message=='User is invalid'
			0*paymentGateway.processPayment(paymentdetails)
	}

	def "process paymnent when user is valid" (){   
		given:"an instance of user and paymentdetails paymentService"
			def User user= new User();
			def paymentdetails= new PaymentDetails()
			uservalidator.validateUser(user)>> true
			paymentGateway.processPayment(paymentdetails)>>true
		when:"user and paymentdetails instance is provided"
			paymentService.processPayment(user,paymentdetails);
		then:""
	}
}
