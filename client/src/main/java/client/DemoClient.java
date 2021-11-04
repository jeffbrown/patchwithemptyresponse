package client;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Patch;
import io.micronaut.http.client.annotation.Client;

@Client("http://localhost:8080")
public interface DemoClient {

    @Patch("/demo")
    HttpResponse callServer();
}
