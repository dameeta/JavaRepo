public class threadex {

    public static void main(String[] args) {
        Runnable nr = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside run method");
            }

        };
        System.out.println("inside run");
        nr.run();


    }
}
