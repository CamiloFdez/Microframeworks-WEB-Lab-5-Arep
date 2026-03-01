package arep.framework;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import arep.Lab5Application;

public class HttpServerTest {

    @BeforeAll
    public static void startServer() {
        new Thread(() -> {
            try {
                Lab5Application.main(new String[]{});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shouldReturnPiFromApp() throws Exception {
        String response = sendRequest("/App/pi");
        assertTrue(response.contains("PI="));
    }

    @Test
    public void shouldReturnHelloWorld() throws Exception {
        String response = sendRequest("/App/helloWorld");
        assertTrue(response.contains("Hello World"));
    }

    @Test
    public void shouldReturnEulerFromMethod() throws Exception {
        String response = sendRequest("/App/frommethod");
        assertTrue(response.contains("Euler="));
    }

    @Test
    public void shouldReturnHelloWithName() throws Exception {
        String response = sendRequest("/App/hello?name=Camilo");
        assertTrue(response.contains("Hello Camilo"));
    }

    @Test
    public void shouldReturnPiFromRootEndpoint() throws Exception {
        String response = sendRequest("/pi");
        assertTrue(response.contains(String.valueOf(Math.PI)));
    }

    private static String sendRequest(String path) throws Exception {
        Socket socket = new Socket("localhost", 8080);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        out.println("GET " + path + " HTTP/1.1");
        out.println("Host: localhost");
        out.println();
        out.flush();

        String line;
        StringBuilder response = new StringBuilder();
        while ((line = in.readLine()) != null) {
            response.append(line);
        }

        socket.close();
        return response.toString();
    }
}