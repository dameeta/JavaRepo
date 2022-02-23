package concurrentDemos;

import java.util.concurrent.ConcurrentLinkedQueue;

public class concurrQueue implements Runnable{

private ConcurrentLinkedQueue<String> conlinkqueue=new ConcurrentLinkedQueue<String>();
	
	public String dequeItem()
	{
		
		if(!conlinkqueue.isEmpty())
		{
			System.out.println("Queue size" + conlinkqueue.size());
			return conlinkqueue.remove();
		}
		else {
			return null;
		}
	}
	private void enqueitem(String item)
	{
		System.out.println("Enque the item in the queue" +item);
		conlinkqueue.add(item);
	}
	
	public int getQueuSize()
	{
		
		if(!conlinkqueue.isEmpty()) {
			return conlinkqueue.size();
		}
		else {
			return 0;
		}
	}
	@Override
	public void run() {

		for(int i=0;i<10;i++)
		 {
			enqueitem("String" + i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
