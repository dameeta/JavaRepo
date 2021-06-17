
public class Exception1 {

	int Add(int x[]) throws Exception
	{
		
		 x = new int[4];
		 int sum=0;
		for(int i=0;i<=4;i++)
		{
			x[i]=i;
			sum = sum + x[i];
		}
		return sum; 
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub

		int y[]=new int[5];
		Exception1 ex1=new Exception1();
try {
		ex1.Add(y);
}
catch(Exception e)
{

}
	}

}
