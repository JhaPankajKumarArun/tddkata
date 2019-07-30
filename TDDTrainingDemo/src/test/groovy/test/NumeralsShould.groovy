package test;

import static org.junit.Assert.*

import spock.lang.Specification
import spock.lang.Unroll
import tdd.NumeralsToRoman

class NumeralsShould extends Specification{

	@Unroll
	def "Convert to Roman" (){
		given: "NumeralsToRoman class instance"
			def NumeralsToRoman ntr= new NumeralsToRoman();
		when: "any numerals is passed"
			def result=	ntr.convert(input);
		then: "converted result should match with expected result"
			result == expectedResult
		where: 
			input	|	expectedResult		
			 1		|	"I"
			 2		|   "II"
			 3		|   "III"
			 
			 5		|	"V"
			 6		|	"VI"
			 7		|	"VII"
			 8		|	"VIII"
			 
			 10		| 	"X"
			 11		| 	"XI"
			 12		| 	"XII"
			 13		| 	"XIII"
			 
			 25		| 	"XXV"
			 
		  
	}

}
