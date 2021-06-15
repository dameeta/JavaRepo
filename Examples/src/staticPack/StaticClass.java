package staticPack;

public class StaticClass {

	
	public static int x;
	
	public static int  showData()
	{
		System.out.println(x++);
		return x;
	}
}
