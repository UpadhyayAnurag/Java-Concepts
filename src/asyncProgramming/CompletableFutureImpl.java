package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

public class CompletableFutureImpl {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Completable future implementation
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return "Inventory available";
                });

        future.thenApply(result -> result + " - Order confirmed")
                .thenAccept(System.out::println)
                .join();
        System.out.println("Doing other work...");
    }
}
