package Thread;

public class testThread extends Thread{
	
	public void run()
	{
		System.out.println("inside run..");

		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Thread th1=new Thread();
		testThread t1=new testThread();
		
		testThread t2=new testThread();
		t1.start();
		
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		Thread.currentThread().setName("t2");


	}

}
