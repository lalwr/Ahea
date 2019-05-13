package java9_110;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class HTTP1_BLOCKING {

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        //HTTP1_BLOCKING Mode
        HttpResponse<String> response = client.send(
                HttpRequest
                        .newBuilder(URI.create("http://google.com"))
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString()
        );
        System.out.println("Status code = " + response.statusCode());
        String body = response.body().toString();
        System.out.println(body);

    }
}
