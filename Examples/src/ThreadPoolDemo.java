import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{

private int taskno;
public Tasks(int taskno) {
	// TODO Auto-generated constructor stub
this.taskno=taskno;

}


@Override
public void run() {

	for(int i=0;i==100;i+=25)
	{
String name=Thread.currentThread().getName();
System.out.println(name + "completed task :"+ taskno +" by " + i + "percent.");
try {
	Thread.sleep(1000);
}
catch(InterruptedException ie)
{
	
}
		
	}
}
}
public class ThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService es=Executors.newFixedThreadPool(2);
//create 4 task
Tasks t[]=new Tasks[4];

for(int i=0;i<4;i++)
{
t[i]=new Tasks(i);
System.out.println(i);
es.execute(t[i]);
}
es.shutdown();
	}

}