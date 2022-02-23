package concurrentDemos;

import java.util.concurrent.Executor;

public class client implements Runnable {
private concurrQueue crq;

public client(concurrQueue cq)
{
	this.crq=cq;
	
}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean stopcondition = (crq.getQueuSize()==0);
		while(!stopcondition)
		{
			for(int i=0;i<crq.getQueuSize();i++)
			{
				System.out.println("Client wants to deque item" + crq.dequeItem());
				
				try {
					Thread.sleep(1300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				stopcondition = crq.getQueuSize()==0;
			}
			System.out.println("Client Process exiting...");
		}
	}

}
