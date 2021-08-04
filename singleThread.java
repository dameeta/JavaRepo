package ThreadPack;

public class singleThread extends Thread{
	

	public void run()
	{
System.out.println("Inside run method....");
Thread mainthread=Thread.currentThread();
System.out.println("Thread " + mainthread + "is running");
mainthread.setName("custom");
System.out.println("Thread " + mainthread + "is running");
int ctr=Thread.activeCount();
System.out.println("Count of thread is"+ ctr);

	}
	public static void main(String[] args) {
		singleThread st1=new singleThread();
		singleThread st2=new singleThread();

	//Thread t1=new Thread(st1);
	

		st1.start();
		st2.start();
		System.out.println(Thread.currentThread());
		st1.setName("new Thread");
		System.out.println(Thread.currentThread());


	}

}
