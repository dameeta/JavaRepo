package Exception;

import java.util.Scanner;

class InvalidAge extends Exception{

	public InvalidAge(String msg)
	{
		super(msg);
		//System.out.println(msg);
	}
}

 public class testMyException {
	 
	 
	 public static void main(String [] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the age in number");
		int age=sc.nextInt();
		 try {
			if(age<18)
			{
				throw new InvalidAge("Age is small ");
			}
			
		}
		 catch(InvalidAge iv)
		 {
			 //System.out.println("Invalid Age of person");
		 System.out.println(iv.getMessage());
		 }
		 
	}
 }