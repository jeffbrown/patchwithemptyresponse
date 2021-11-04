package server;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Patch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/demo")
public class DemoController {
    static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Patch
    HttpResponse doSomething() {
        log.info("Returning an empty response with status code 200");
        return HttpResponse.ok();
    }
}
