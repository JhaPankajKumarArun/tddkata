package tdd;

public class StringCalculator {

	public int add(String numbers){
		int result =0;
		if("".equals(numbers)){
			return -1;	
		}
		if(numbers.length()>0){
			String splitedString[]=numbers.split(",");
			for(int i=0;i<splitedString.length;i++){
				result +=Integer.parseInt(splitedString[i]);	
			}
		}
		return result;
	}
}
