package arep.appexample;

import static arep.HttpServer.get;

import java.io.IOException;
import java.net.URISyntaxException;

import arep.HttpServer;

public class MathServices {
    public static void main(String[] args) throws IOException, URISyntaxException {
        get("/pi", (req,res) -> "PI= " + Math.PI);
        get("/hello", (req,res) -> "Hello World");
        get("/frommethod", (req,res) -> getEuler());
        HttpServer.main(args);
    }

    private static String getEuler() {
        return "Euler= " + Math.E;
    }
}
