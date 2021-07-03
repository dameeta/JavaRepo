 package lambda;

public class colonDemo {

	static void disp()
	{
		System.out.println("disp method..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r1=()->System.out.println("Hello from lambda");
r1.run();
Runnable r2=colonDemo::disp;
	r2.run();
	}

}
