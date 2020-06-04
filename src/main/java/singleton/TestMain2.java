package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> System.out.println(SingleTon2.getInstance()));
        }
    }
}
