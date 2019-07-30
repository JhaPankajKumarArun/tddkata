package tdd;

public class NumeralsToRoman {

	public String convert(int input){
		String output="";
		int remainder= input%10;
		
		if(input>9){
			output="X";
		}
		if(remainder>4){
			output="V";
			for(int i=6;i<=remainder;i++){
				output+="I";	
			}
		}
		if(remainder<4){
			for(int i=1;i<=remainder;i++){
				output+="I";	
			}
		}
		return output;
	}
}
