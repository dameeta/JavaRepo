package ArraysExamples;

class A
{

	public void Add(int ... varargs)
	{
		int total=0;
		for(int i: varargs)
		{
			total += i;
		}
		System.out.println(total);
		
	}
}
public class varArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		
		a1.Add(1,2,3);
		a1.Add(1,2,5,6,7);
		a1.Add(1,2);
		a1.Add(1);
		a1.Add(1,2,3,0,7,0,1,2);
	}

}
