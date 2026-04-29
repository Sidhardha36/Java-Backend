public class RaceCondition {
    static int count=0;

    public static void main(String args[]) throws InterruptedException {

        // Creating 3 thread:
        Thread t1=new Thread(() -> {
            for(int i=0;i<10000;i++){
                count++;
            }
        });

        Thread t2=new Thread(() -> {
            for(int i=0;i<10000;i++){
                count++;
            }
        });

        Thread t3=new Thread(() -> {
            for(int i=0;i<10000;i++){
                count++;
            }
        });


        // Start 3 Threads
        t1.start();
        t2.start();
        t3.start();
        
        // Waiting all to get finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Expected: 3000");
        System.out.println("Actual:   "+count);


    }
}
