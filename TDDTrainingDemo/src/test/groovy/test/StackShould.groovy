package test;

import static org.junit.Assert.*

import spock.lang.Specification
import tdd.Stack;
class StackShould extends Specification {
	def "Pop last element from empty stack " (){
		given:"Stack object"
			def Stack stack= new Stack();
		when:"pop operation is performed"
			stack.pop()
		then:"it should throw an exception when stack is empty"
			thrown(Exception)	
	}
	
	def "Push an element into stack" (){
		given:"Stack object"
				def Stack stack= new Stack();
		when:"push operation is performed"
				stack.push(element)
		then:"element should be pushed in the stack"
				stack.pop()==expectedResult
		where:
			element 				| expectedResult
			new Integer(1)			|	1
	}	
	
	def "Pop last element from non empty stack" (){
		given:"Stack object"
			def Stack stack= new Stack();
			stack.push(new Integer(1));
			stack.push(new Integer(2));
			stack.push(new Integer(3));
		when:"pop operation is performed"
			def result1= stack.pop()
			def result2= stack.pop()
			def result3= stack.pop()
		then:"should remove and return last element from stack"
			result1	==3 &&
			result2	==2 &&
			result3	==1
			
	}
	
}
