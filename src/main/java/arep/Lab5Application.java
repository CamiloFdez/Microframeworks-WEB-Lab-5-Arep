package arep;

import static arep.framework.WebFramework.get;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import arep.framework.HttpServer;


@SpringBootApplication
public class Lab5Application {


    public static void main(String[] args) {

        get("/pi", (req, res) -> String.valueOf(Math.PI));
        get("/euler", (req, res) -> String.valueOf(Math.E));

		HttpServer.staticfiles("webroot/public");
    }

}
