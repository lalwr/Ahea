package java9_110;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class HTTP2_PUSH {

    public static void main(String[] args) {
        HttpClient client = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        Map< HttpRequest, CompletableFuture< HttpResponse<String>>> responses =
                client.sendAsync(
                        HttpRequest.newBuilder(URI.create("http://google.com"))
                                .GET()
                                .build(),
                        HttpResponse.MultiProcessor.asMap(request -> Optional.of(HttpResponse.BodyHandler.asString()))
                ).join();
        responses.forEach((request, responseFuture) -> {
            System.out.println("Async response: " + responseFuture.getNow(null));
        });


    }
}
