
public class myException {

	
	public static int divide(int x,int y) 
	{
		if(y<=0)
		{
			throw new ArithmeticException();
			
		}
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int v1=7,v2=3;
		
		
		System.out.println(divide(3,1));
	    
		//e.printStackTrace();	
			//System.out.println(e+ "hello dont provide denominator as zero");
		}
	

	
	
}
