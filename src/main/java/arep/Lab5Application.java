package arep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import static arep.lab5.WebFramework.get;


@SpringBootApplication
public class Lab5Application {


    public static void main(String[] args) {

        get("/pi", (req, res) -> String.valueOf(Math.PI));
        get("/euler", (req, res) -> String.valueOf(Math.E));

        HttpServer.main(35000);
    }

}
