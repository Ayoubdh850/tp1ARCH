package server;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Service déployé sur " + url);
    }
}
