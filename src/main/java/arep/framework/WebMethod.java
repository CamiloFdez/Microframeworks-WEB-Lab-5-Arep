package arep.framework;

public interface WebMethod {
    String execute(HttpRequest req, HttpResponse res);
}
