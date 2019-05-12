package java9_110_2;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JAVA9_110 {

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient
                .newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpResponse<String> response = client.send(
                HttpRequest
                        .newBuilder(new URI("http://naver.com"))
                        .POST(HttpRequest.BodyProcessor.fromString("Hello world"))
                        .build(),
                HttpResponse.BodyHandler.asString()
        );
    }
}
