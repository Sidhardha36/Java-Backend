import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ExecutorRaceCondition {

    ExecutorService pool=Executors.newFixedThreadPool(3);

    pool.submit(() ->{
        for(int i=0;i<10000;i++){
            count++;
        }
    });

    pool.submit(()  ->{
        for(int i=0;i<10000;i++){
            count++;
        }
    });

    pool.submit(()  ->{
        for(int i=0;i<10000;i++){
            count++;
        }
    });

    pool.shutdown();

    pool.awaitTermination(10, TimeUnit.SECONDS);

    System.out.println("Excepted: 30000");
    System.out.println("Actual: "+ count);
}
