package client;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "client", description = "...",
        mixinStandardHelpOptions = true)
public class ClientCommand implements Runnable {

    static final Logger log = LoggerFactory.getLogger(ClientCommand.class);

    @Inject
    DemoClient client;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(ClientCommand.class, args);
    }

    public void run() {
        log.info("Before calling server.");
        client.callServer();
        log.info("After calling server");
    }
}
