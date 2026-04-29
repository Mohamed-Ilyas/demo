import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    SharedValue shVal;
    ReentrantLock lock;
    Object random;

    public Subtractor(SharedValue shVal, Object random) {
        this.random = random;
        this.shVal = shVal;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++) {
            synchronized (random) {
                System.out.println("Subtractor : " + i);
                shVal.i -= i;
            }
        }
        return null;
    }
}
