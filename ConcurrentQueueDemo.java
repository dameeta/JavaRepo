package concurrentDemos;

import java.util.concurrent.Executor;

public class ConcurrentQueueDemo  implements Executor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Executor exe=new ConcurrentQueueDemo();
concurrQueue cq=new concurrQueue();
	exe.execute(cq);
	exe.execute(new client(cq));
	}

	@Override
	public void execute(Runnable r) {
		// TODO Auto-generated method stub
		new Thread(r).start();
	}

}
