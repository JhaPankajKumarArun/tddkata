package test;

import static org.junit.Assert.*

import spock.lang.Specification
import tdd.StringCalculator

class StringCalculatorSpec extends Specification { 

	def'API to calculate sum from given string'(){
		given: 'An instance of StringCalculator'
			StringCalculator stringCalc= new StringCalculator();
		when: 'StringCalculator.add is called'
			def retVal = stringCalc.add(input);
		then: 'It should return zero'
			retVal==result
		where :
			input		|	 result
			""			|	-1
			"1,2"		|	 3
			//null		| 	-1
	
	}
}
