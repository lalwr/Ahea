package java9_110;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class HTTP1_NONBLOCKING {

    public static void main(String[] args) {
        URI TEST_URI = URI.create("https://www.google.com/");

        HttpClient client = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        List < CompletableFuture < String >> responseFutures = new Random()
                .ints(10)
                .mapToObj(String::valueOf)
                .map(message -> client
                        .sendAsync(
                                HttpRequest.newBuilder(TEST_URI)
                                        .POST(HttpRequest.BodyProcessor.fromString(message))
                                        .build(),
                                HttpResponse.BodyHandler.asString()
                        )
                        .thenApply(r -> r.body())
                )
                .collect(Collectors.toList());
        CompletableFuture.allOf(responseFutures.toArray(new CompletableFuture<?>[0])).join();
        responseFutures.stream().forEach(future -> {
            System.out.println("Async response: " + future.getNow(null));
        });

    }
}
