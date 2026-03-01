package arep;

import static arep.framework.WebFramework.get;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import arep.framework.HttpServer;
import arep.appexample.*;


@SpringBootApplication
public class Lab5Application {


    public static void main(String[] args) throws IOException, URISyntaxException {

        get("/pi", (req, res) -> String.valueOf(Math.PI));
        get("/euler", (req, res) -> String.valueOf(Math.E));

		HttpServer.staticfiles("webroot/public");
        MathServices.register(args);
        HttpServer.main(args);
    }
}
