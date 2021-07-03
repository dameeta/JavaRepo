package lambda;

import java.util.function.Function;

public class Functionlamba {
//create a funtion to return length of string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Function<String,Integer>len=(str)->str.length();
 String str="Hello lambda";
 System.out.println("length of the string is" +len.apply(str));
	}

}
