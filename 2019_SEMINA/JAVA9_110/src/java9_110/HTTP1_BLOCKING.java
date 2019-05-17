package java9_110;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;

public class HTTP1_BLOCKING {

    public static void main(String[] args) throws IOException, InterruptedException {
        URI TEST_URI = URI.create("https://www.google.com/");

        HttpClient client = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpResponse<String> response = client.send(
                HttpRequest
                        .newBuilder(TEST_URI)
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString()
        );
        System.out.println("Status code = " + response.statusCode());
        String body = response.body();
        System.out.println(body);

    }
}
