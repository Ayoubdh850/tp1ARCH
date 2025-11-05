package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 11.0;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9000, new Date());
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 1000, new Date()));
        comptes.add(new Compte(2, 3000, new Date()));
        comptes.add(new Compte(3, 7000, new Date()));
        return comptes;
    }
}
