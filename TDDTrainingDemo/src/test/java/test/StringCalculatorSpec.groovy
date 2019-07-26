package test;

import static org.junit.Assert.*

import org.junit.Test

import spock.lang.Specification

class StringCalculatorSpec extends Specification {

	def'API to calculate string'(){
		given: 'Empty string'
			def argument=""
		when: 'StringCalculator.add is called'
			def retVal = StringCalculator.add(argument);
		then: 'It should return zero'
			retVal=="0"
	}
}
