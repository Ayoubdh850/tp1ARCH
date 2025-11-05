package Serveur;

import jakarta.xml.ws.Endpoint;
import service.Calculatrice;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/WS/Calculatrice";
        Endpoint.publish(url, new Calculatrice());
        System.out.println("✅ Service Calculatrice publié avec succès sur : " + url);
        System.out.println("🔗 Pour voir le WSDL : " + url + "?wsdl");
    }
}
