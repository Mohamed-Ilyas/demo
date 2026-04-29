import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        SharedValue shVal = new SharedValue();
        ReentrantLock lock = new ReentrantLock();
        Object random = new Object();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> addFuture = es.submit(new Adder(shVal, random));
        Future<Void> subFuture = es.submit(new Subtractor(shVal, random));

        addFuture.get();
        subFuture.get();

        System.out.println(shVal.i);
    }
}
