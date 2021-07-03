import java.util.Scanner;

public class MyThreadWtVolatile  extends Thread {
    private volatile boolean running = true;   //non-volatile keyword

    public void run() {
        while (running) {
            System.out.println("hello");
        }
    }

    public void shutdown() {
        running = false;
    }


    public static void main(String[] args) {
    	MyThreadWtVolatile obj = new MyThreadWtVolatile();
        obj.start();

        Scanner input = new Scanner(System.in);
        input.nextLine(); 
        obj.shutdown();   
    }    
}
