
public class finallyDemo {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
int x=6 ,y=0;
		try {
			System.out.println(x/y);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		finally
		{
			System.out.println("Always execute..");
			
		}	
	}
	

}
