import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FixedCounter {
    
    // Synchronized
    static int SynCount=0;
    static synchronized void incrementSyn() {
        SynCount++;
    }

    // Atomic Integer

    static AtomicInteger atomicCount=new AtomicInteger(0);

    // Reentrantlook

    static int lockCount=0;
    static Lock lock=new ReentrantLock();
    public static void main(String args[]) throws InterruptedException {

        // Fix1 -- Synchronization
        Thread s1=new Thread(() ->{
            for(int i=0;i<10000;i++) incrementSyn();
        });
        Thread s2=new Thread(() ->{
            for(int i=0;i<10000;i++)  incrementSyn();
        });
        Thread s3=new Thread(() ->{
            for(int i=0;i<10000;i++)  incrementSyn();
        });

        s1.start(); s2.start(); s3.start();
        s1.join(); s2.join(); s3.join();
        System.out.println("Fix1 Syncronzied: "+ SynCount);

        //  Fix 2 -- Atomic Integer
        Thread a1=new Thread(() ->{
            for(int i=0;i<10000;i++) atomicCount.incrementAndGet();
        });
        Thread a2=new Thread(() -> {
            for(int i=0;i<10000;i++) atomicCount.incrementAndGet();
        });
        Thread a3=new Thread(() ->{
            for(int i=0;i<10000;i++) atomicCount.incrementAndGet();
        });

        a1.start(); a2.start(); a3.start();
        a1.join(); a2.join(); a3.join();
        System.out.println("Fix2 AtomicInteger: "+ atomicCount.get());

        // Fix3 -- Reentrantlock
        Thread l1=new Thread(() ->{
            for(int i=0;i<10000;i++){
                lock.lock();
                try{ lockCount++; }
                finally{ lock.unlock(); }
            }
        });
        Thread l2=new Thread(() ->{
            for(int i=0;i<10000;i++){
                lock.lock();
                try { lockCount++; }
                finally { lock.unlock(); }

            }
        });
        Thread l3=new Thread(() ->{
            for(int i=0;i<10000;i++){
                lock.lock();
                try { lockCount++; }
                finally { lock.unlock(); }
            }
        });

        l1.start(); l2.start(); l3.start();
        l1.join(); l2.join(); l3.join();
        System.out.println("Fix3 Reentrantlock: "+ lockCount);

        System.out.println("All should be 30000 ");


    }
}
