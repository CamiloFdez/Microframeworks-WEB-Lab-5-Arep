package arep.appexample;

import static arep.HttpServer.get;

import java.io.IOException;
import java.net.URISyntaxException;

import arep.HttpServer;

public class MathServices {
    public static void main(String[] args) throws IOException, URISyntaxException {
        get("/pi", (req,res) -> "PI= " + Math.PI);
        get("/helloWorld", (req,res) -> "Hello World");
        get("/frommethod", (req,res) -> getEuler());

        get("/hello", (req, res) -> "Hello " + req.getValue("name"));
        HttpServer.main(args);
    }

    private static String getEuler() {
        return "Euler= " + Math.E;
    }
}
