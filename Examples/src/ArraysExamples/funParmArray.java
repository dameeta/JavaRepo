package ArraysExamples;

import java.util.Scanner;

class TestA{
	
	public void myFunc(int x[])
	{
		int l;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		x=new int[l];
		for(int i=0;i<l;i++)
		{
			x[i] = sc.nextInt();
		//System.out.println();
		}
		for(int i=0;i<l;i++)
		{
	//	x[i] = sc.nextInt();
		System.out.print(x[i]+ " ");
		}
	
	
	}
}


public class funParmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int y[]=new int[size];
		
		TestA ta=new TestA();
		ta.myFunc(y);
		
	}

}
