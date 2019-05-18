package java9_110;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AN_Synchronous_GET {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException, URISyntaxException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://google.com/ahea.txt"))
                .GET()
                .build();
        CompletableFuture<HttpResponse<String>> response = client.sendAsync(request,
                HttpResponse.BodyHandler.asString());

        HttpResponse<String> actualResponse = response.get(1000, TimeUnit.MINUTES);



    }
}
