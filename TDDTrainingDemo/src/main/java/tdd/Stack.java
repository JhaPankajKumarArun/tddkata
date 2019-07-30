package tdd;

import java.util.ArrayList;
import java.util.List;

public class Stack { 
	private List<Object> stack= new ArrayList<>();
	
	public Object pop() throws Exception {
		if(stack.isEmpty()){
			throw new Exception();
		}
		return stack.remove(stack.size()-1);
	}
	public void push(Object element){
		stack.add(element);
	}
}
