package client;

public class ClientWS {
    public static void main(String[] args) {
        // Création du stub (service)
        BanqueWS service = new BanqueWS();

        // Récupération du port (proxy)
        BanqueService proxy = service.getBanqueServicePort();

        // Test de la méthode conversion
        double montant = 100;
        double resultat = proxy.conversionEuroToDH(montant);
        System.out.println(montant + " Euro = " + resultat + " Dinars");

        // Test de la méthode getCompte
        Compte c = proxy.getCompte(5);
        System.out.println("Code : " + c.getCode());
        System.out.println("Solde : " + c.getSolde());

        // Test de la méthode getComptes
        System.out.println("Liste des comptes :");
        for (Compte cp : proxy.getComptes()) {
            System.out.println("- " + cp.getCode() + " : " + cp.getSolde());
        }
    }
}
