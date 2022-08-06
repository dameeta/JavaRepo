public class threadDemo  extends  Thread{
    private  String n;
    private String name;

@Override
public void run()
    {
        for(int i=0;i<10;i++)
        {

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println("Child thread is paused");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child thread is started");



    }

    public static void main(String [] args)
    {
        threadDemo t=new threadDemo();
        Thread th1=new Thread(t);
        th1.setName("firstThread");

        th1.start();
        th1.setPriority(2);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
        }
    }
}
