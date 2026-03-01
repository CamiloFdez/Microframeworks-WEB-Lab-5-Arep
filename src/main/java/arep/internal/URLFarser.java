package arep.internal;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class URLFarser {
    public static void main(String[] args) throws URISyntaxException,MalformedInputException, MalformedURLException {
        URL myurl = new URI ("http://ldbn.is.escuelaing.edu.co").toURL();

        System.out.println("Host: " + myurl.getHost());
        System.out.println("Port: " + myurl.getPort());
        System.out.println("Path: " + myurl.getPath());
    }
}
