
public class VolatileTest implements Runnable {

    private static final int MegaBytes = 10241024;
    private static final Object counterLock = new Object();
    private static int counter = 0;
    private static volatile int counter1 = 0;

    private volatile int counter2 = 0;
    private int counter3 = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            concurrentMethodWrong();
        }
   }

    void addInstanceVolatile() {
        synchronized (counterLock) {
            counter2 = counter2 + 1;
            System.out.println( Thread.currentThread().getName() +"\t\t « InstanceVolatile :: "+ counter2);
        }
    }

    public void concurrentMethodWrong() {
        counter = counter + 1;
        System.out.println( Thread.currentThread().getName() +" « Static :: "+ counter);
        sleepThread( 1/4 );

        counter1 = counter1 + 1;
        System.out.println( Thread.currentThread().getName() +"\t « StaticVolatile :: "+ counter1);
        sleepThread( 1/4 );

        addInstanceVolatile();
        sleepThread( 1/4 );

        counter3 = counter3 + 1;
        sleepThread( 1/4 );
        System.out.println( Thread.currentThread().getName() +"\t\t\t\t\t « Instance :: "+ counter3);
    }
    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        int availableProcessors = runtime.availableProcessors();
        System.out.println("availableProcessors :: "+availableProcessors);
        System.out.println("MAX JVM will attempt to use : "+ runtime.maxMemory() / MegaBytes );
        System.out.println("JVM totalMemory also equals to initial heap size of JVM : "+ runtime.totalMemory() / MegaBytes );
        System.out.println("Returns the amount of free memory in the JVM : "+ runtime.freeMemory() / MegaBytes );
        System.out.println(" ===== ----- ===== ");

        VolatileTest volatileTest = new VolatileTest();
        Thread t1 = new Thread( volatileTest );
        t1.start();

        Thread t2 = new Thread( volatileTest );
        t2.start();

        Thread t3 = new Thread( volatileTest );
        t3.start();

        Thread t4 = new Thread( volatileTest );
        t4.start();

        Thread.sleep( 10 );;

        Thread optimizeation = new Thread() {
            @Override public void run() {
                System.out.println("Thread Start.");

                Integer appendingVal = volatileTest.counter2 + volatileTest.counter2 + volatileTest.counter2;

                System.out.println("End of Thread." + appendingVal);
            }
        };
        optimizeation.start();
    }

    public void sleepThread( long sec ) {
        try {
            Thread.sleep( sec * 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
