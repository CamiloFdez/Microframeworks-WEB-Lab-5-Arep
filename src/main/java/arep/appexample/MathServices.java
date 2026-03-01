package arep.appexample;

import static arep.HttpServer.get;

import java.io.IOException;
import java.net.URISyntaxException;

import arep.HttpServer;

public class MathServices {
    public static void main(String[] args) throws IOException, URISyntaxException {

        HttpServer.staticfiles("webroot/public");

        get("/App/pi", (req,res) -> "PI= " + Math.PI);
        get("/App/helloWorld", (req,res) -> "Hello World");
        get("/App/frommethod", (req,res) -> getEuler());

        get("/App/hello", (req, res) -> "Hello " + req.getValue("name"));
        HttpServer.main(args);
    }

    private static String getEuler() {
        return "Euler= " + Math.E;
    }
}
